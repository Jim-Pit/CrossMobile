/*
 * (c) 2019 by Panayotis Katsaloulis
 *
 * CrossMobile is free software; you can redistribute it and/or modify
 * it under the terms of the CrossMobile Community License as published
 * by the CrossMobile team.
 *
 * CrossMobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CrossMobile Community License for more details.
 *
 * You should have received a copy of the CrossMobile Community
 * License along with CrossMobile; if not, please contact the
 * CrossMobile team at https://crossmobile.tech/contact/
 */
package crossmobile.ios.uikit;

import crossmobile.ios.foundation.NSObject;
import org.crossmobile.bridge.ann.CMClass;
import org.crossmobile.bridge.ann.CMConstructor;
import org.crossmobile.bridge.ann.CMGetter;
import org.crossmobile.bridge.ann.CMSelector;

@CMClass
public class UIStoryboardSegue extends NSObject {

    private final UIViewController destinationViewController;
    private final UIViewController sourceViewController;
    private final String identifier;
    private Runnable performHandler;

    @CMConstructor("- (instancetype)initWithIdentifier:(NSString *)identifier \n" +
            "                            source:(UIViewController *)source \n" +
            "                       destination:(UIViewController *)destination;")
    public UIStoryboardSegue(String identifier, UIViewController source, UIViewController destination) {
        this.identifier = identifier;
        this.sourceViewController = source;
        this.destinationViewController = destination;
    }

    private UIStoryboardSegue(String identifier, UIViewController source, UIViewController destination, Runnable performHandler) {
        this(identifier, source, destination);
        this.performHandler = performHandler;
    }

    @CMSelector("+ (instancetype)segueWithIdentifier:(NSString *)identifier \n" +
            "                             source:(UIViewController *)source \n" +
            "                        destination:(UIViewController *)destination \n" +
            "                     performHandler:(void (^)(void))performHandler;")
    public static UIStoryboardSegue segueWithIdentifier(String identifier, UIViewController source, UIViewController destination, Runnable performHandler) {
        return new UIStoryboardSegue(identifier, source, destination, performHandler);
    }

    @CMSelector("- (void)perform;")
    public void perform() {
        if (performHandler != null)
            performHandler.run();
    }

    @CMGetter("@property(nonatomic, copy, readonly) NSString *identifier;")
    public String identifier() {
        return identifier;
    }

    @CMGetter("@property(nonatomic, readonly) __kindof UIViewController *sourceViewController;")
    public UIViewController sourceViewController() {
        return sourceViewController;
    }

    @CMGetter("@property(nonatomic, readonly) __kindof UIViewController *destinationViewController;")
    public UIViewController destinationViewController() {
        return destinationViewController;
    }

}
