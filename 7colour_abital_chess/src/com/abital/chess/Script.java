// Copyright 2010 Google Inc. All Rights Reserved.

package com.abital.chess;

import android.content.Context;
import android.content.res.Resources;
import com.abital.chess.R;

public class Script {

  public final static int ID = R.raw.game;
  //public final static int GM = R.raw.test;
  public static String sFileName;
  //public static String gFileName;
  
  //get the file name by ID
  public static String getFileName(Context context) {
    if (sFileName == null) {
      Resources resources = context.getResources();
      //Resources phpresources = context.getResources();
      String name = resources.getText(ID).toString();
      //String name = phpresources.getText(GM).toString();
      sFileName = name.substring(name.lastIndexOf('/') + 1, name.length());
    }
    return sFileName;
  }
  //get the file extension
  public static String getFileExtension(Context context) {
    if (sFileName == null) {
      getFileName(context);
    }
    int dotIndex = sFileName.lastIndexOf('.');
    if (dotIndex == -1) {
      return null;
    }
    return sFileName.substring(dotIndex);
  }
  
}
