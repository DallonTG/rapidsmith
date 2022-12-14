/*
 * Copyright (c) 2010-2011 Brigham Young University
 * 
 * This file is part of the BYU RapidSmith Tools.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License..
 * 
 */
package edu.byu.ece.rapidSmith.tests;

import edu.byu.ece.rapidSmith.design.Design;
import edu.byu.ece.rapidSmith.util.MessageGenerator;

public class CreateDiffXDL {
	public static void main(String[] args){
		if(args.length != 2){
			MessageGenerator.briefMessageAndExit("USAGE: <firstXDLDesign.xdl> <secondXDLDesign.xdl>");
		}
		Design d1 = new Design(args[0]);
		Design d2 = new Design(args[1]);
		d1.saveComparableXDLFile(args[0].replace(".xdl", "_diff.xdl"));
		d2.saveComparableXDLFile(args[1].replace(".xdl", "_diff.xdl"));
	}
}
