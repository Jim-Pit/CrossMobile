// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_messageui_MFMessageComposeViewControllerDelegate definition

#import "xmlvm.h"
#import <MessageUI/MessageUI.h>
@class crossmobile_ios_messageui_MFMessageComposeViewController;

CM_EXPORT_CLASS
@protocol crossmobile_ios_messageui_MFMessageComposeViewControllerDelegate
- (void) didFinishWithResult___crossmobile_ios_messageui_MFMessageComposeViewController_int:(MFMessageComposeViewController*) controller :(int) result ;
@end
