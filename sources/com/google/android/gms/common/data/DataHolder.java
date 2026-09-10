package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        public DataHolder build(int i2) {
            return new DataHolder(this, i2);
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        public DataHolder build(int i2, Bundle bundle) {
            return new DataHolder(this, i2, bundle);
        }
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static DataHolder empty(int i2) {
        return new DataHolder(zaf, i2, (Bundle) null);
    }

    private final void zae(String str, int i2) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i2 < 0 || i2 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i2, this.zad);
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i2) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i3 = 0;
        boolean z2 = false;
        while (i3 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i3 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i3);
                int i4 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i4 >= builder.zaa.length) {
                        z2 = zPutDouble ? false : true;
                        i3++;
                    } else if (zPutDouble) {
                        String str = builder.zaa[i4];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i3, i4);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i3, i4);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i3, i4);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i3, i4);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i3, i4);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i3, i4);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i4);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i3, i4);
                        }
                        i4++;
                    }
                    if (z2) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn't populate window data for row " + i3 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    i3--;
                    i3++;
                }
            } catch (RuntimeException e2) {
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList2.get(i5)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i2 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i2 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i2].close();
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getLong(i2, this.zab.getInt(str)) == 1;
    }

    public byte[] getByteArray(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getBlob(i2, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getInt(i2, this.zab.getInt(str));
    }

    public long getLong(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getLong(i2, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getString(i2, this.zab.getInt(str));
    }

    public int getWindowIndex(int i2) {
        int length;
        int i3 = 0;
        Preconditions.checkState(i2 >= 0 && i2 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            if (i2 < iArr[i3]) {
                i3--;
                break;
            }
            i3++;
        }
        return i3 == length ? i3 - 1 : i3;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].isNull(i2, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z2;
        synchronized (this) {
            z2 = this.zae;
        }
        return z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String[] strArr = this.zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i2, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getDouble(i2, this.zab.getInt(str));
    }

    public final float zab(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getFloat(i2, this.zab.getInt(str));
    }

    public final void zac(String str, int i2, int i3, CharArrayBuffer charArrayBuffer) {
        zae(str, i2);
        this.zah[i3].copyStringToBuffer(i2, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i3 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i3], i3);
            i3++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i2 >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i2] = numRows;
            numRows += this.zah[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
            i2++;
        }
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i2;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i3;
        this.zaj = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i2;
        this.zaj = bundle;
        zad();
    }

    public DataHolder(Cursor cursor, int i2, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i2, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i2, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i2, (Bundle) null);
    }
}
