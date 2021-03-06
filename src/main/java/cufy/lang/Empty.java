/*
 *	Copyright 2020 Cufyorg
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *	    http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package cufy.lang;

/**
 * A class Represents emptiness.
 *
 * @author LSaferSE
 * @version 1 release (03-Mar-2020)
 * @since 03-Mar-2020
 */
final public class Empty {
	/**
	 * This is a representation class and should not be instanced.
	 *
	 * @throws AssertionError when called
	 */
	private Empty() {
		throw new AssertionError("No instance for you!");
	}
}
