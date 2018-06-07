/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package core.cst.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.xml.sax.InputSource;

import com.google.gson.Gson;

import core.exolab.cst.xml.*;

public class UnmarshallerFromJson extends Unmarshaller {

	public static Object unmarshal(Class c, Reader reader) 
			throws MarshalException {
		try {
			BufferedReader bufreader = new BufferedReader(reader);
			Gson gson = new Gson();
			String jsonStr = new String();
			int simbol;
			while ((simbol = bufreader.read()) != -1)
				jsonStr += (char)simbol;

			Object obj = gson.fromJson(jsonStr, c);
			return obj;
		} catch (IOException except) {
			throw new MarshalException(except);
		}
	}
}
