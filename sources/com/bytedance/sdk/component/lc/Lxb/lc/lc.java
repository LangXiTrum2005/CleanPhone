package com.bytedance.sdk.component.lc.Lxb.lc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements JXs {
    private Context Lxb;

    public lc(Context context) {
        this.Lxb = context;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.JXs
    public void LD(ZU zu) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", zu.Lxb());
        contentValues.put("url", zu.LD());
        contentValues.put("replaceholder", Integer.valueOf(zu.lk() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(zu.ZU()));
        contentValues.put("error_code", zu.ebl());
        contentValues.put("error_msg", zu.QAg());
        contentValues.put("url_type", Integer.valueOf(zu.JXs()));
        contentValues.put("ad_id", zu.lc());
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(this.Lxb, "trackurl", contentValues, "id=?", new String[]{zu.Lxb()});
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.JXs
    public List<ZU> Lxb() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(this.Lxb, "trackurl", null, null, null, null, null, null);
        if (cursorLxb != null) {
            while (cursorLxb.moveToNext()) {
                try {
                    try {
                        String string = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                        String string2 = cursorLxb.getString(cursorLxb.getColumnIndex("url"));
                        boolean z = cursorLxb.getInt(cursorLxb.getColumnIndex("replaceholder")) > 0;
                        int i = cursorLxb.getInt(cursorLxb.getColumnIndex("retry"));
                        int i2 = cursorLxb.getInt(cursorLxb.getColumnIndex("url_type"));
                        String string3 = cursorLxb.getString(cursorLxb.getColumnIndex("ad_id"));
                        String string4 = cursorLxb.getString(cursorLxb.getColumnIndex("error_code"));
                        String string5 = cursorLxb.getString(cursorLxb.getColumnIndex("error_msg"));
                        ZU zu = new ZU(string, string2, z, i2, string3);
                        zu.Lxb(i);
                        if (!TextUtils.isEmpty(string4)) {
                            zu.Lxb(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            zu.LD(string5);
                        }
                        linkedList.add(zu);
                    } finally {
                        cursorLxb.close();
                    }
                } catch (Throwable unused) {
                }
            }
            cursorLxb.close();
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.JXs
    public void lk(ZU zu) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(this.Lxb, "trackurl", "id=?", new String[]{zu.Lxb()});
    }

    public static String LD() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.JXs
    public ZU Lxb(String str) {
        Cursor cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(this.Lxb, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorLxb != null && cursorLxb.moveToFirst()) {
            try {
                String string = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                String string2 = cursorLxb.getString(cursorLxb.getColumnIndex("url"));
                boolean z = cursorLxb.getInt(cursorLxb.getColumnIndex("replaceholder")) > 0;
                int i = cursorLxb.getInt(cursorLxb.getColumnIndex("retry"));
                int i2 = cursorLxb.getInt(cursorLxb.getColumnIndex("url_type"));
                String string3 = cursorLxb.getString(cursorLxb.getColumnIndex("ad_id"));
                String string4 = cursorLxb.getString(cursorLxb.getColumnIndex("error_code"));
                String string5 = cursorLxb.getString(cursorLxb.getColumnIndex("error_msg"));
                ZU zu = new ZU(string, string2, z, i2, string3);
                zu.Lxb(i);
                if (!TextUtils.isEmpty(string4)) {
                    zu.Lxb(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    zu.LD(string5);
                }
                cursorLxb.close();
                return zu;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorLxb.close();
                    cursorLxb = null;
                } catch (Throwable th2) {
                    cursorLxb.close();
                    throw th2;
                }
            }
        }
        if (cursorLxb != null) {
            cursorLxb.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.JXs
    public void Lxb(ZU zu) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", zu.Lxb());
        contentValues.put("url", zu.LD());
        contentValues.put("replaceholder", Integer.valueOf(zu.lk() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(zu.ZU()));
        contentValues.put("url_type", Integer.valueOf(zu.JXs()));
        contentValues.put("ad_id", zu.lc());
        contentValues.put("error_code", zu.ebl());
        contentValues.put("error_msg", zu.QAg());
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(this.Lxb, "trackurl", contentValues);
    }
}
