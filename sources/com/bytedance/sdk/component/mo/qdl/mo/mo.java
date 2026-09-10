package com.bytedance.sdk.component.mo.qdl.mo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mo implements mzz {
    private Context qdl;

    public mo(Context context) {
        this.qdl = context;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.mzz
    public void lnr(mml mmlVar) {
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(this.qdl, "trackurl", "id=?", new String[]{mmlVar.qdl()});
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.mzz
    public List<mml> qdl() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(this.qdl, "trackurl", null, null, null, null, null, null);
        if (cursorQdl != null) {
            while (cursorQdl.moveToNext()) {
                try {
                    try {
                        String string = cursorQdl.getString(cursorQdl.getColumnIndex("id"));
                        String string2 = cursorQdl.getString(cursorQdl.getColumnIndex("url"));
                        boolean z2 = cursorQdl.getInt(cursorQdl.getColumnIndex("replaceholder")) > 0;
                        int i2 = cursorQdl.getInt(cursorQdl.getColumnIndex("retry"));
                        int i3 = cursorQdl.getInt(cursorQdl.getColumnIndex("url_type"));
                        String string3 = cursorQdl.getString(cursorQdl.getColumnIndex("ad_id"));
                        String string4 = cursorQdl.getString(cursorQdl.getColumnIndex("error_code"));
                        String string5 = cursorQdl.getString(cursorQdl.getColumnIndex("error_msg"));
                        mml mmlVar = new mml(string, string2, z2, i3, string3);
                        mmlVar.qdl(i2);
                        if (!TextUtils.isEmpty(string4)) {
                            mmlVar.qdl(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            mmlVar.ud(string5);
                        }
                        linkedList.add(mmlVar);
                    } finally {
                        cursorQdl.close();
                    }
                } catch (Throwable unused) {
                    return linkedList;
                }
            }
            cursorQdl.close();
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.mzz
    public void ud(mml mmlVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", mmlVar.qdl());
        contentValues.put("url", mmlVar.ud());
        contentValues.put("replaceholder", Integer.valueOf(mmlVar.lnr() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(mmlVar.mml()));
        contentValues.put("error_code", mmlVar.wd());
        contentValues.put("error_msg", mmlVar.tvp());
        contentValues.put("url_type", Integer.valueOf(mmlVar.mzz()));
        contentValues.put("ad_id", mmlVar.mo());
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(this.qdl, "trackurl", contentValues, "id=?", new String[]{mmlVar.qdl()});
    }

    public static String ud() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.mzz
    public mml qdl(String str) {
        Cursor cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(this.qdl, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorQdl != null && cursorQdl.moveToFirst()) {
            try {
                String string = cursorQdl.getString(cursorQdl.getColumnIndex("id"));
                String string2 = cursorQdl.getString(cursorQdl.getColumnIndex("url"));
                boolean z2 = cursorQdl.getInt(cursorQdl.getColumnIndex("replaceholder")) > 0;
                int i2 = cursorQdl.getInt(cursorQdl.getColumnIndex("retry"));
                int i3 = cursorQdl.getInt(cursorQdl.getColumnIndex("url_type"));
                String string3 = cursorQdl.getString(cursorQdl.getColumnIndex("ad_id"));
                String string4 = cursorQdl.getString(cursorQdl.getColumnIndex("error_code"));
                String string5 = cursorQdl.getString(cursorQdl.getColumnIndex("error_msg"));
                mml mmlVar = new mml(string, string2, z2, i3, string3);
                mmlVar.qdl(i2);
                if (!TextUtils.isEmpty(string4)) {
                    mmlVar.qdl(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    mmlVar.ud(string5);
                }
                cursorQdl.close();
                return mmlVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorQdl.close();
                    cursorQdl = null;
                } catch (Throwable th2) {
                    cursorQdl.close();
                    throw th2;
                }
            }
        }
        if (cursorQdl != null) {
            cursorQdl.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.mzz
    public void qdl(mml mmlVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", mmlVar.qdl());
        contentValues.put("url", mmlVar.ud());
        contentValues.put("replaceholder", Integer.valueOf(mmlVar.lnr() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(mmlVar.mml()));
        contentValues.put("url_type", Integer.valueOf(mmlVar.mzz()));
        contentValues.put("ad_id", mmlVar.mo());
        contentValues.put("error_code", mmlVar.wd());
        contentValues.put("error_msg", mmlVar.tvp());
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(this.qdl, "trackurl", contentValues);
    }
}
