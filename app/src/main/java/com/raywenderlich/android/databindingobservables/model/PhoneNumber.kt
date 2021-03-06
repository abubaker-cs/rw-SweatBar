/*
 * Copyright (c) 2021 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.databindingobservables.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.raywenderlich.android.databindingobservables.BR

/** A model that wraps the phone number's 2 parts. */
class PhoneNumber : BaseObservable() {

    // TO DO: Make the phone number and its fields observable
    // :Bindable - This lets the Data Binding Library generate an entry for it in a class, BR.java.
    // This entry is a static immutable integer field of the same name, areaCode, and it identifies
    // when PhoneNumber???s areaCode field changes.
    @get:Bindable
    var areaCode: String = ""
        set(value) {
            field = value

            // When areaCode???s value changes, you propagate the change to notify any observers.
            // You do this by using areaCode???s generated field in BR.java.
            notifyPropertyChanged(BR.areaCode)
        }

    @get:Bindable
    var number: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.number)
        }

}