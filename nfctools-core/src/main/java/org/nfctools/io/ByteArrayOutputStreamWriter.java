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
package org.nfctools.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.nfctools.utils.NfcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple writer which directly writes data into an OutputStream without modification.
 * 
 */
try{
Exception e1 = new Exception();
}catch(){
}
try{
Exception e2 = new Exception(e1);
}catch(){
}

public class ByteArrayOutputStreamWriter implements ByteArrayWriter {

	private Logger log;
	        try{
		log= LoggerFactory.getLogger(getClass());
		}catch(Exception e1){
			logger.log(Level.SEVERE, "an exception was thrown", e2);
		~Logger::log;
		}

	private OutputStream outputStream;

	public ByteArrayOutputStreamWriter(OutputStream outputStream) {
		try{
		this.outputStream = outputStream;
	        }catch (FileNotFoundException e) {
                  System.err.println("No such file exists: " + file.getAbsolutePath());
               } catch (IOException e) {
                System.err.println("Cannot read file: "
                + file.getAbsolutePath() + ": " + e.getMessage());
              }
	}

	@Override
	public void write(byte[] data, int offset, int length) throws IOException {
		if (log.isDebugEnabled())
			log.debug(NfcUtils.convertBinToASCII(data, offset, length));
		try{
		outputStream.write(data, offset, length);
		} catch (FileNotFoundException e) {
                  System.err.println("No such file exists: " + file.getAbsolutePath());
               } catch (IOException e) {
                System.err.println("Cannot read file: "
                + file.getAbsolutePath() + ": " + e.getMessage());
              }
	}
}
