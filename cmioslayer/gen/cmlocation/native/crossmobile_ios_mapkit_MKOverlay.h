// (c) 2019 under LGPL by CrossMobile plugin tools

// crossmobile_ios_mapkit_MKOverlay definition

#import "xmlvm.h"
#import <CoreLocation/CoreLocation.h>
#import <MapKit/MapKit.h>
@class crossmobile_ios_corelocation_CLLocationCoordinate2D;
@class crossmobile_ios_mapkit_MKMapRect;
@class java_lang_String;

@protocol crossmobile_ios_mapkit_MKOverlay
- (crossmobile_ios_mapkit_MKMapRect*) boundingMapRect__;
- (crossmobile_ios_corelocation_CLLocationCoordinate2D*) coordinate__;
- (NSString*) subtitle__;
- (NSString*) title__;
- (BOOL) canReplaceMapContent__;
- (BOOL) intersectsMapRect___crossmobile_ios_mapkit_MKMapRect:(crossmobile_ios_mapkit_MKMapRect*) mapRect ;
- (void) setCoordinate___crossmobile_ios_corelocation_CLLocationCoordinate2D:(crossmobile_ios_corelocation_CLLocationCoordinate2D*) newCoordinate ;
@end
