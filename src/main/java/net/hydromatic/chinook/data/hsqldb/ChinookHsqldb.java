/*
 * Licensed to Julian Hyde under one or more contributor license
 * agreements.  See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership. Julian Hyde
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hydromatic.chinook.data.hsqldb;

/** Chinook data set in hsqldb format. */
public class ChinookHsqldb {
  /** URI of the hsqldb database. */
  public static final String URI = "jdbc:hsqldb:res:chinook";
  public static final String USER = "CHINOOK";
  public static final String PASSWORD = "CHINOOK";
  public static final String SCHEMA = "chinook";
}

// End ChinookHsqldb.java
