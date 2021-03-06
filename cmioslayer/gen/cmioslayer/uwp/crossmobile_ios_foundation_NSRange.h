// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_foundation_NSRange definition

#import "xmlvm.h"
#import <CoreGraphics/CoreGraphics.h>
#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "java_lang_Object.h"

@interface crossmobile_ios_foundation_NSRange : java_lang_Object {
@public int location_int;
@public int length_int;
}

- (crossmobile_ios_foundation_NSRange*) __init_crossmobile_ios_foundation_NSRange___int_int:(int) loc :(int) len ;
- (void) setLength___int:(int) length ;
- (int) getLength__;
- (void) setLocation___int:(int) location ;
- (int) getLocation__;
- (instancetype) initWithNSRange:(NSRange) reference;
- (void) setNSRange:(NSRange) other;
- (NSRange) getNSRange;
@end
