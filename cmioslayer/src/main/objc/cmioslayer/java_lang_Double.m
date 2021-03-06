/* Copyright (c) 2002-2011 by XMLVM.org
 *
 * Project Info:  http://www.xmlvm.org
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 */

#import "java_lang_Double.h"
#import "java_lang_NumberFormatException.h"


// java.lang.Double
//----------------------------------------------------------------------------
@implementation java_lang_Double

+ (double) parseDouble___java_lang_String: (java_lang_String *) str
{
    char * end;
    double result = strtod([str UTF8String], &end);
    if (*end!='\0') {
        java_lang_NumberFormatException* ex = [[java_lang_NumberFormatException alloc] init];
        [ex __init_java_lang_NumberFormatException__];
        @throw ex;
    } else
        return result;
}

+ (java_lang_String*) toString___double: (double) d
{
    java_lang_Double* proxy = [[java_lang_Double alloc] __init_java_lang_Double___double:d];
    NSString* result = [proxy toString__];
    [proxy release];
    return result;
}

+ (java_lang_Double*) valueOf___double: (double) d
{
    return [[java_lang_Double alloc] __init_java_lang_Double___double:d];
}

- (instancetype) __init_java_lang_Double___double :(double) d
{
    return [self initWithDouble:d];
}

- (double) unbox
{
    return [self doubleValue];
}


@end
