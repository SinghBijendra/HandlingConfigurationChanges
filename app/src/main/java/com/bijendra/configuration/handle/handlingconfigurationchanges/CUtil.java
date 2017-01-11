package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Newdream on 10-Jan-17.
 */

public class CUtil {
    public static void showMsg(Context context, String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
