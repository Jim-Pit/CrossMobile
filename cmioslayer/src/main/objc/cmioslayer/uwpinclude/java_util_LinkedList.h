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

#import "xmlvm.h"
#import "java_lang_Object.h"
#import "java_util_Collection.h"
#import "java_util_ListIterator.h"


// java.util.LinkedList
//----------------------------------------------------------------------------

#define java_util_LinkedList NSMutableArray
@interface NSMutableArray (cat_java_util_LinkedList)

- (instancetype) __init_java_util_LinkedList__;

- (java_lang_Object*) getFirst__;
- (java_lang_Object*) getLast__;
- (java_lang_Object*) removeFirst__;
- (java_lang_Object*) removeLast__;
- (void) addFirst___java_lang_Object :(java_lang_Object*)n1;
- (void) addLast___java_lang_Object :(java_lang_Object*)n1;
- (int) contains___java_lang_Object :(java_lang_Object*)n1;
- (int) size__;
- (int) add___java_lang_Object :(java_lang_Object*)n1;
- (int) remove___java_lang_Object :(java_lang_Object*)n1;
- (int) addAll___java_util_Collection :(java_util_Collection*)n1;
- (int) addAll___int_java_util_Collection :(int)n1 :(java_util_Collection*)n2;
- (void) clear__;
- (java_lang_Object*) get___int :(int)n1;
- (java_lang_Object*) set___int_java_lang_Object :(int)n1 :(java_lang_Object*)n2;
- (void) add___int_java_lang_Object :(int)n1 :(java_lang_Object*)n2;
- (java_lang_Object*) remove___int :(int)n1;
- (int) indexOf___java_lang_Object :(java_lang_Object*)n1;
- (int) lastIndexOf___java_lang_Object :(java_lang_Object*)n1;
- (java_lang_Object*) peek__;
- (java_lang_Object*) element__;
- (java_lang_Object*) poll__;
- (java_lang_Object*) remove__;
- (int) offer___java_lang_Object :(java_lang_Object*)n1;
- (int) offerFirst___java_lang_Object :(java_lang_Object*)n1;
- (int) offerLast___java_lang_Object :(java_lang_Object*)n1;
- (java_lang_Object*) peekFirst__;
- (java_lang_Object*) peekLast__;
- (java_lang_Object*) pollFirst__;
- (java_lang_Object*) pollLast__;
- (void) push___java_lang_Object :(java_lang_Object*)n1;
- (java_lang_Object*) pop__;
- (int) removeFirstOccurrence___java_lang_Object :(java_lang_Object*)n1;
- (int) removeLastOccurrence___java_lang_Object :(java_lang_Object*)n1;
- (java_util_ListIterator*) listIterator___int :(int)n1;
- (java_util_Iterator*) descendingIterator__;
- (XMLVMArray*) toArray__;
- (XMLVMArray*) toArray___java_lang_Object_ARRAYTYPE :(XMLVMArray*)n1;




@end
