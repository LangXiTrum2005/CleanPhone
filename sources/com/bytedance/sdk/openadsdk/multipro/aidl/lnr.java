package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements Cursor {
    int lnr = 0;
    Map<String, List<String>> qdl;
    String[] ud;

    public lnr(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.qdl = new HashMap();
            return;
        }
        this.qdl = map;
        try {
            this.ud = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i2) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.ud;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.ud;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.ud;
            if (i2 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i2])) {
                return i2;
            }
            i2++;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i2) {
        if (i2 < 0) {
            return "";
        }
        String[] strArr = this.ud;
        return i2 < strArr.length ? strArr[i2] : "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.ud;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.ud;
            if (strArr != null && strArr.length != 0) {
                return this.qdl.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i2) {
        try {
            return Double.parseDouble(getString(i2));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i2) {
        try {
            return Float.parseFloat(getString(i2));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i2) {
        try {
            return Integer.parseInt(getString(i2));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i2) {
        try {
            return Long.parseLong(getString(i2));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.lnr;
    }

    @Override // android.database.Cursor
    public short getShort(int i2) {
        try {
            return Short.parseShort(getString(i2));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i2) {
        return (i2 < 0 || i2 >= getColumnCount()) ? "" : this.qdl.get(this.ud[i2]).get(getPosition());
    }

    @Override // android.database.Cursor
    public int getType(int i2) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.lnr == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.lnr == getCount() - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i2) {
        return getString(i2) == null;
    }

    @Override // android.database.Cursor
    public boolean move(int i2) {
        if (this.lnr + i2 >= getCount()) {
            return false;
        }
        this.lnr += i2;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.lnr = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.lnr = this.qdl.get(this.ud[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.lnr + 1 >= getCount()) {
            return false;
        }
        this.lnr++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i2) {
        if (i2 >= getCount()) {
            return false;
        }
        this.lnr = i2;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i2 = this.lnr;
        if (i2 - 1 < 0) {
            return false;
        }
        this.lnr = i2 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
