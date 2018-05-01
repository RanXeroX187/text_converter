/*
 * Copyright (C)  2017-2018 Tran Le Duy
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.duy.core.tools;

import com.duy.text.converter.core.stylish.StylistGenerator;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Duy on 11-Jul-17.
 */
public class ArrayEffectTest extends TestCase {

    public void test1() throws IOException {
        StylistGenerator effectEncoder = new StylistGenerator();
        ArrayList<String> generate = effectEncoder.generate( "the quick brown fox jumps over the lazy dog");

        final File fileDir = new File("C:\\github\\text_converter\\sharedcode\\src\\test\\java\\com\\d" +
                "uy\\sharedcode\\tools", "test1.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(fileDir);
        for (String s : generate) {
            fileOutputStream.write(s.getBytes());
            fileOutputStream.write('\n');
        }
        fileOutputStream.close();
    }

    public void testUnicode() throws IOException {
        StylistGenerator effectEncoder = new StylistGenerator();
        ArrayList<String> generate = effectEncoder.generate( "Xin chào tất cả các bạn");

        final File fileDir = new File("C:\\github\\text_converter\\sharedcode\\src\\test\\java\\com\\d" +
                "uy\\sharedcode\\tools", "testUnicode.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(fileDir);
        for (String s : generate) {
            fileOutputStream.write(s.getBytes());
            fileOutputStream.write('\n');
        }
        fileOutputStream.close();
    }
}