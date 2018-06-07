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

import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;

import core.exolab.cst.xml.*;

public class MarshallerToJson extends Marshaller {
	public static void marshal(Object object, Writer out) 
			throws MarshalException {
		if (object == null)
			throw new MarshalException("not null");

		try {
			Gson gson=new Gson();
			String toFile = gson.toJson(object);
			out.write(toFile);
		} catch (IOException except) {
			throw new MarshalException(except);
		}
	}
}
