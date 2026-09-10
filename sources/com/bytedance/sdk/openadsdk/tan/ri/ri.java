package com.bytedance.sdk.openadsdk.tan.ri;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements Cursor {
    int ik = 0;
    String[] lr;
    Map<String, List<String>> ri;

    public ri(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.ri = new HashMap();
            return;
        }
        this.ri = map;
        try {
            this.lr = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.lr;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.lr;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr2 = this.lr;
            if (i >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i])) {
                return i;
            }
            i++;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.lr;
        return i < strArr.length ? strArr[i] : "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.lr;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.lr;
            if (strArr != null && strArr.length != 0) {
                return this.ri.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        try {
            return Double.parseDouble(getString(i));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        try {
            return Float.parseFloat(getString(i));
        } catch (Exception unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        try {
            return Integer.parseInt(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        try {
            return Long.parseLong(getString(i));
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
        return this.ik;
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        try {
            return Short.parseShort(getString(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i) {
        return (i < 0 || i >= getColumnCount()) ? "" : this.ri.get(this.lr[i]).get(getPosition());
    }

    @Override // android.database.Cursor
    public int getType(int i) {
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
        return this.ik == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.ik == getCount() - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        return getString(i) == null;
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        if (this.ik + i >= getCount()) {
            return false;
        }
        this.ik += i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.ik = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.ik = this.ri.get(this.lr[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.ik + 1 >= getCount()) {
            return false;
        }
        this.ik++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.ik = i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.ik;
        if (i - 1 < 0) {
            return false;
        }
        this.ik = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }
}
