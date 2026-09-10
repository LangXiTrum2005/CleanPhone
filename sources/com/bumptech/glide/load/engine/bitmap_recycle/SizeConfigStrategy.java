package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.a;
import com.bumptech.glide.util.Util;
import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class SizeConfigStrategy implements LruPoolStrategy {
    public static final Bitmap.Config[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f12501e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f12502h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyPool f12503a = new KeyPool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupedLinkedMap f12504b = new GroupedLinkedMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12505c = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12506a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f12506a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12506a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12506a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12506a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Key implements Poolable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyPool f12507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f12509c;

        public Key(KeyPool keyPool) {
            this.f12507a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f12507a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.f12508b == key.f12508b && Util.b(this.f12509c, key.f12509c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i2 = this.f12508b * 31;
            Bitmap.Config config = this.f12509c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return SizeConfigStrategy.c(this.f12508b, this.f12509c);
        }
    }

    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        f12501e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f12502h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i2, Bitmap.Config config) {
        return d9.i.d + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(Util.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = Util.d(config) * i2 * i3;
        KeyPool keyPool = this.f12503a;
        Key key = (Key) keyPool.b();
        key.f12508b = iD;
        key.f12509c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = AnonymousClass1.f12506a[config.ordinal()];
            if (i4 == 1) {
                configArr = d;
            } else if (i4 == 2) {
                configArr = f;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : f12502h;
            } else {
                configArr = g;
            }
        } else {
            configArr = f12501e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                keyPool.c(key);
                int iIntValue = num.intValue();
                key = (Key) keyPool.b();
                key.f12508b = iIntValue;
                key.f12509c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f12504b.a(key);
        if (bitmap != null) {
            a(Integer.valueOf(key.f12508b), bitmap);
            bitmap.reconfigure(i2, i3, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f12505c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final String e(int i2, int i3, Bitmap.Config config) {
        return c(Util.d(config) * i2 * i3, config);
    }

    public final void f(Bitmap bitmap) {
        int iC = Util.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        Key key = (Key) this.f12503a.b();
        key.f12508b = iC;
        key.f12509c = config;
        this.f12504b.b(key, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(key.f12508b));
        navigableMapD.put(Integer.valueOf(key.f12508b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbW = a.w("SizeConfigStrategy{groupedMap=");
        sbW.append(this.f12504b);
        sbW.append(", sortedSizes=(");
        HashMap map = this.f12505c;
        for (Map.Entry entry : map.entrySet()) {
            sbW.append(entry.getKey());
            sbW.append(AbstractJsonLexerKt.BEGIN_LIST);
            sbW.append(entry.getValue());
            sbW.append("], ");
        }
        if (!map.isEmpty()) {
            sbW.replace(sbW.length() - 2, sbW.length(), "");
        }
        sbW.append(")}");
        return sbW.toString();
    }
}
