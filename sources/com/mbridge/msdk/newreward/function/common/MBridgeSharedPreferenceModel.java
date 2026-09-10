package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.directory.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MBridgeSharedPreferenceModel {
    private static final String DEFAULT_NAME = "mbridge_new_config";
    private volatile FastKV mFastKV;
    private final String mName;
    private static final ConcurrentHashMap<String, String> mStringCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Integer> mIntegerCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Long> mLongCache = new ConcurrentHashMap<>();
    private static final Map<String, MBridgeSharedPreferenceModel> mInstanceMap = new HashMap();
    private static final String mPath = e.b(c.MBRIDGE_700_CONFIG) + File.separator;

    private MBridgeSharedPreferenceModel(String str) {
        this.mName = str;
        initFastKV();
    }

    public static MBridgeSharedPreferenceModel getInstance() {
        return getInstance("");
    }

    private int getIntegerValue(String str, int i) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            int i2 = this.mFastKV.getInt(str, i);
            mIntegerCache.put(str, Integer.valueOf(i2));
            return i2;
        } catch (Exception unused) {
            return i;
        }
    }

    private long getLongValue(String str, long j) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            long j2 = this.mFastKV.getLong(str, j);
            mLongCache.put(str, Long.valueOf(j2));
            return j2;
        } catch (Exception unused) {
            return j;
        }
    }

    private String getStringValue(String str, String str2) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        String string = this.mFastKV.getString(str, str2);
        if (string != null) {
            mStringCache.put(str, string);
        }
        return string;
    }

    private void initFastKV() {
        if (this.mFastKV == null) {
            try {
                this.mFastKV = new FastKV.Builder(mPath, this.mName).build();
            } catch (Exception unused) {
            }
        }
    }

    private void putIntegerValue(String str, int i) {
        try {
            mIntegerCache.put(str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putInt(str, i);
        } catch (Exception unused2) {
        }
    }

    private void putLongValue(String str, long j) {
        try {
            mLongCache.put(str, Long.valueOf(j));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putLong(str, j);
        } catch (Exception unused2) {
        }
    }

    private void putStringValue(String str, String str2) {
        try {
            mStringCache.put(str, str2);
            this.mFastKV.putString(str, str2);
        } catch (Exception unused) {
        }
    }

    public void clear() {
        mStringCache.clear();
        mIntegerCache.clear();
        mLongCache.clear();
        if (this.mFastKV != null) {
            this.mFastKV.clear();
        }
    }

    public int getInteger(String str, int i) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = mIntegerCache;
        return (!concurrentHashMap.containsKey(str) || (num = concurrentHashMap.get(str)) == null) ? getIntegerValue(str, i) : num.intValue();
    }

    public long getLong(String str, long j) {
        Long l;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = mLongCache;
        return (!concurrentHashMap.containsKey(str) || (l = concurrentHashMap.get(str)) == null) ? getLongValue(str, j) : l.longValue();
    }

    public String getString(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = mStringCache;
        return concurrentHashMap.containsKey(str) ? concurrentHashMap.get(str) : getStringValue(str, str2);
    }

    public void init() {
    }

    public void putInteger(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = mIntegerCache;
        if (!concurrentHashMap.containsKey(str)) {
            putIntegerValue(str, i);
            return;
        }
        Integer num = concurrentHashMap.get(str);
        if (num == null || num.intValue() != i) {
            putIntegerValue(str, i);
        }
    }

    public void putLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = mLongCache;
        if (!concurrentHashMap.containsKey(str)) {
            putLongValue(str, j);
            return;
        }
        Long l = concurrentHashMap.get(str);
        if (l == null || l.longValue() != j) {
            putLongValue(str, j);
        }
    }

    public void putString(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = mStringCache;
        if (!concurrentHashMap.containsKey(str)) {
            putStringValue(str, str2);
        } else {
            if (TextUtils.equals(concurrentHashMap.get(str), str2)) {
                return;
            }
            putStringValue(str, str2);
        }
    }

    public static MBridgeSharedPreferenceModel getInstance(String str) {
        MBridgeSharedPreferenceModel mBridgeSharedPreferenceModel;
        Map<String, MBridgeSharedPreferenceModel> map = mInstanceMap;
        synchronized (map) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = DEFAULT_NAME;
                }
                mBridgeSharedPreferenceModel = map.get(str);
                if (mBridgeSharedPreferenceModel == null) {
                    mBridgeSharedPreferenceModel = new MBridgeSharedPreferenceModel(str);
                    map.put(str, mBridgeSharedPreferenceModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mBridgeSharedPreferenceModel;
    }
}
