package com.bytedance.sdk.component.di.ri.di;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di implements fi {
    private Context ri;

    public di(Context context) {
        this.ri = context;
    }

    @Override // com.bytedance.sdk.component.di.ri.di.fi
    public void ik(ka kaVar) {
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(this.ri, "trackurl", "id=?", new String[]{kaVar.ri()});
    }

    @Override // com.bytedance.sdk.component.di.ri.di.fi
    public void lr(ka kaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kaVar.ri());
        contentValues.put("url", kaVar.lr());
        contentValues.put("replaceholder", Integer.valueOf(kaVar.ik() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(kaVar.ka()));
        contentValues.put("error_code", kaVar.xha());
        contentValues.put("error_msg", kaVar.jbs());
        contentValues.put("url_type", Integer.valueOf(kaVar.fi()));
        contentValues.put("ad_id", kaVar.di());
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(this.ri, "trackurl", contentValues, "id=?", new String[]{kaVar.ri()});
    }

    @Override // com.bytedance.sdk.component.di.ri.di.fi
    public List<ka> ri() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(this.ri, "trackurl", null, null, null, null, null, null);
        if (cursorRi != null) {
            while (cursorRi.moveToNext()) {
                try {
                    try {
                        String string = cursorRi.getString(cursorRi.getColumnIndex("id"));
                        String string2 = cursorRi.getString(cursorRi.getColumnIndex("url"));
                        boolean z = cursorRi.getInt(cursorRi.getColumnIndex("replaceholder")) > 0;
                        int i = cursorRi.getInt(cursorRi.getColumnIndex("retry"));
                        int i2 = cursorRi.getInt(cursorRi.getColumnIndex("url_type"));
                        String string3 = cursorRi.getString(cursorRi.getColumnIndex("ad_id"));
                        String string4 = cursorRi.getString(cursorRi.getColumnIndex("error_code"));
                        String string5 = cursorRi.getString(cursorRi.getColumnIndex("error_msg"));
                        ka kaVar = new ka(string, string2, z, i2, string3);
                        kaVar.ri(i);
                        if (!TextUtils.isEmpty(string4)) {
                            kaVar.ri(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            kaVar.lr(string5);
                        }
                        linkedList.add(kaVar);
                    } finally {
                        cursorRi.close();
                    }
                } catch (Throwable unused) {
                    return linkedList;
                }
            }
            cursorRi.close();
            return linkedList;
        }
        return linkedList;
    }

    public static String lr() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.di.ri.di.fi
    public ka ri(String str) {
        Cursor cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(this.ri, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorRi != null && cursorRi.moveToFirst()) {
            try {
                String string = cursorRi.getString(cursorRi.getColumnIndex("id"));
                String string2 = cursorRi.getString(cursorRi.getColumnIndex("url"));
                boolean z = cursorRi.getInt(cursorRi.getColumnIndex("replaceholder")) > 0;
                int i = cursorRi.getInt(cursorRi.getColumnIndex("retry"));
                int i2 = cursorRi.getInt(cursorRi.getColumnIndex("url_type"));
                String string3 = cursorRi.getString(cursorRi.getColumnIndex("ad_id"));
                String string4 = cursorRi.getString(cursorRi.getColumnIndex("error_code"));
                String string5 = cursorRi.getString(cursorRi.getColumnIndex("error_msg"));
                ka kaVar = new ka(string, string2, z, i2, string3);
                kaVar.ri(i);
                if (!TextUtils.isEmpty(string4)) {
                    kaVar.ri(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    kaVar.lr(string5);
                }
                cursorRi.close();
                return kaVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorRi.close();
                    cursorRi = null;
                } catch (Throwable th2) {
                    cursorRi.close();
                    throw th2;
                }
            }
        }
        if (cursorRi != null) {
            cursorRi.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.di.fi
    public void ri(ka kaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kaVar.ri());
        contentValues.put("url", kaVar.lr());
        contentValues.put("replaceholder", Integer.valueOf(kaVar.ik() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(kaVar.ka()));
        contentValues.put("url_type", Integer.valueOf(kaVar.fi()));
        contentValues.put("ad_id", kaVar.di());
        contentValues.put("error_code", kaVar.xha());
        contentValues.put("error_msg", kaVar.jbs());
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(this.ri, "trackurl", contentValues);
    }
}
