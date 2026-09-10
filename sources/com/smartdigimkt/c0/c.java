package com.smartdigimkt.c0;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c implements e<String, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f34018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34020c;

    public c(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f34019b = i2;
        this.f34018a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmap = this.f34018a.get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void remove(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmapRemove = this.f34018a.remove(str);
                if (bitmapRemove != null) {
                    this.f34020c -= b(str, bitmapRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.c0.e
    public void clear() {
        a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f34019b));
    }

    private int b(String str, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean put(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                try {
                    this.f34020c += b(str, bitmap);
                    Bitmap bitmapPut = this.f34018a.put(str, bitmap);
                    if (bitmapPut != null) {
                        this.f34020c -= b(str, bitmapPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f34019b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f34020c < 0 || (this.f34018a.isEmpty() && this.f34020c != 0)) {
                        break;
                    }
                    if (this.f34020c > i2 && !this.f34018a.isEmpty()) {
                        Map.Entry<String, Bitmap> next = this.f34018a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f34018a.remove(key).recycle();
                            this.f34020c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    @Override // com.smartdigimkt.c0.e
    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f34018a.keySet());
        }
        return hashSet;
    }
}
