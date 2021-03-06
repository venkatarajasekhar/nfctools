/**
 * Copyright 2011-2012 Adrian Stabiszewski, as@nfctools.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nfctools.ndef;

/**
 * The basic message construct defined by this specification. An NDEF message contains
 * one or more NDEF records
 * 
 */

public class NdefMessage {

	private NdefRecord[] ndefRecords;

	public NdefMessage(NdefRecord[] ndefRecords) {
		try{
		this.ndefRecords = ndefRecords;
		}catch(ArithmeticException e){
			System.out.println("task1 is completed");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("task 2 completed");
		}catch(Exception e){
			System.out.println("common task completed");
		}System.out.println("rest of the code...");  
	}

	public NdefRecord[] getNdefRecords() {
		return ndefRecords;
	}
	
  
}
