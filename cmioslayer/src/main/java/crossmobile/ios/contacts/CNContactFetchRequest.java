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
package crossmobile.ios.contacts;

import crossmobile.ios.foundation.NSObject;
import org.crossmobile.bridge.ann.CMClass;
import org.crossmobile.bridge.ann.CMConstructor;
import org.crossmobile.bridge.ann.CMGetter;
import org.crossmobile.bridge.ann.CMSetter;

import java.util.List;

@CMClass
public class CNContactFetchRequest extends NSObject {

    private boolean mutableObjects;
    private boolean unifyResults;
    private int sortOrder;
    private List<String> keysToFetch;

    @CMGetter("@property(nonatomic) BOOL mutableObjects;")
    public boolean mutableObjects() {
        return mutableObjects;
    }

    @CMSetter("@property(nonatomic) BOOL mutableObjects;")
    public void setMutableObjects(boolean mutableObjects) {
        this.mutableObjects = mutableObjects;
    }

    @CMGetter("@property(nonatomic) BOOL unifyResults;")
    public boolean unifyResults() {
        return unifyResults;
    }

    @CMSetter("@property(nonatomic) BOOL unifyResults;")
    public void setUnifyResults(boolean unifyResults) {
        this.unifyResults = unifyResults;
    }

    @CMGetter("@property(nonatomic) CNContactSortOrder sortOrder;")
    public int sortOrder() {
        return sortOrder;
    }

    @CMSetter("@property(nonatomic) CNContactSortOrder sortOrder;")
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @CMGetter("@property(copy, nonatomic) NSArray<id<CNKeyDescriptor>> *keysToFetch;")
    public List<String> keysToFetch() {
        return keysToFetch;
    }

    @CMSetter("@property(copy, nonatomic) NSArray<id<CNKeyDescriptor>> *keysToFetch;")
    public void setKeysToFetch(List<String> keysToFetch) {
        this.keysToFetch = keysToFetch;
    }

    @CMConstructor("- (instancetype)initWithKeysToFetch:(NSArray<id<CNKeyDescriptor>> *)keysToFetch;")
    public CNContactFetchRequest(List<String> keysToFetch) {
        this.keysToFetch = keysToFetch;

    }

}
