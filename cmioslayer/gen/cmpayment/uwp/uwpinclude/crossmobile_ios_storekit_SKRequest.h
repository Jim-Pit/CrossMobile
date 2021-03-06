// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_storekit_SKRequest definition

#import "xmlvm.h"
#import <StoreKit/StoreKit.h>
@protocol crossmobile_ios_storekit_SKRequestDelegate;

CM_EXPORT_CLASS
@interface crossmobile_ios_storekit_SKRequest$Ext : SKRequest
@end

#define crossmobile_ios_storekit_SKRequest SKRequest
@interface SKRequest (cm_crossmobile_ios_storekit_SKRequest)
- (instancetype) __init_crossmobile_ios_storekit_SKRequest__;
- (void) setDelegate___crossmobile_ios_storekit_SKRequestDelegate:(id<SKRequestDelegate>) delegate ;
- (id<SKRequestDelegate>) delegate__;
- (void) cancel__;
- (void) start__;
@end
