// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_contacts_CNSaveRequest definition

#import "xmlvm.h"
#import <Accounts/Accounts.h>
#import <AddressBook/AddressBook.h>
#import <AddressBookUI/AddressBookUI.h>
#import <Contacts/Contacts.h>
@class crossmobile_ios_contacts_CNMutableContact;
@class java_lang_String;

@interface crossmobile_ios_contacts_CNSaveRequest$Ext : CNSaveRequest
@end

#define crossmobile_ios_contacts_CNSaveRequest CNSaveRequest
@interface CNSaveRequest (cm_crossmobile_ios_contacts_CNSaveRequest)
- (void) addContact___crossmobile_ios_contacts_CNMutableContact_java_lang_String:(CNMutableContact*) contact :(NSString*) identifier ;
- (void) deleteContact___crossmobile_ios_contacts_CNMutableContact:(CNMutableContact*) contact ;
- (void) updateContact___crossmobile_ios_contacts_CNMutableContact:(CNMutableContact*) contact ;
@end
