// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_uikit_UIUserNotificationAction definition

#import "xmlvm.h"
#import <UIKit/UIKit.h>
#import <UserNotifications/UserNotifications.h>
@class java_lang_String;
@protocol java_util_Map;

CM_EXPORT_CLASS
@interface crossmobile_ios_uikit_UIUserNotificationAction$Ext : UIUserNotificationAction
@end

#define crossmobile_ios_uikit_UIUserNotificationAction UIUserNotificationAction
@interface UIUserNotificationAction (cm_crossmobile_ios_uikit_UIUserNotificationAction)
- (instancetype) __init_crossmobile_ios_uikit_UIUserNotificationAction__;
- (int) activationMode__;
- (BOOL) isAuthenticationRequired__;
- (int) behavior__;
- (BOOL) isDestructive__;
- (NSString*) identifier__;
- (NSDictionary*) parameters__;
- (NSString*) title__;
@end
