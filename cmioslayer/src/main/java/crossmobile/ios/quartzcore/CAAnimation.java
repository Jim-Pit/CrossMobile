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
package crossmobile.ios.quartzcore;

import crossmobile.ios.foundation.NSObject;
import org.crossmobile.bridge.Native;
import org.crossmobile.bridge.ann.CMClass;
import org.crossmobile.bridge.ann.CMGetter;
import org.crossmobile.bridge.ann.CMSelector;
import org.crossmobile.bridge.ann.CMSetter;

/**
 * CAAnimation class is an abstract class used as a base class for animations.
 */
@CMClass
public abstract class CAAnimation extends NSObject implements CAAction, CAMediaTiming {

    private boolean removedOnCompletion;
    private NSObject delegate;

    /**
     * Specifies the default value of the specified key.
     *
     * @param key The key for which the value is requested.
     * @return The default value for the named property. Returns nil if no
     * default value has been set.
     */
    @CMSelector("+ (id)defaultValueForKey:(NSString *)key;")
    public static String defaultValueForKey(String key) {
        Native.lifecycle().notImplemented();
        return null;
    }

    /**
     * Constructs and returns a new CAAnimation.
     *
     * @return A new CAAnimation object.
     */
    @CMSelector("+ (instancetype)animation;")
    public static CATransition animation() {
        Native.lifecycle().notImplemented();
        return null;
    }

    /**
     * Returns the delegate of this CAAnimation object.
     *
     * @return The delegate of this CAAnimation object.
     */
    @CMGetter("@property(strong) id delegate;")
    public NSObject delegate() {
        return delegate;
    }

    /**
     * Sets the delegate for this CAAnimation object.
     *
     * @param delegate The delegate of this CAAnimation object.
     */
    @CMSetter("@property(strong) id delegate;")
    public void setDelegate(NSObject delegate) {
        this.delegate = delegate;
    }

    /**
     * Returns a Boolean that shows whether this CAAnimation is removed from the
     * layer on completion.
     *
     * @return TRUE then the CAAnimation is removed from the layer on
     * completion.
     */
    @CMGetter("@property(getter=isRemovedOnCompletion) BOOL removedOnCompletion;")
    public boolean isRemovedOnCompletion() {
        return removedOnCompletion;
    }

    /**
     * Sets a Boolean that defines whether this CAAnimation is removed from the
     * layer on completion.
     *
     * @param removedOnCompletion TRUE then the CAAnimation is removed from the
     *                            layer on completion.
     */
    @CMSetter("@property(getter=isRemovedOnCompletion) BOOL removedOnCompletion;")
    public void setRemovedOnCompletion(boolean removedOnCompletion) {
        this.removedOnCompletion = removedOnCompletion;
    }

    /**
     * It is called when the specified CAAnimation begins playing.
     *
     * @param animation The CAAnimation that has just begun playing.
     */
    @CMSelector("- (void)animationDidStart:(CAAnimation *)anim;")
    public abstract void animationDidStart(CAAnimation animation);

    /**
     * It called when the specified CAAnimation finished playing.
     *
     * @param animation The CAAnimation that finished playing.
     * @param finished  Whether the animation finished
     */
    @CMSelector("- (void)animationDidStop:(CAAnimation *)theAnimation finished:(BOOL)flag")
    public abstract void animationDidStop(CAAnimation animation, boolean finished);
}
