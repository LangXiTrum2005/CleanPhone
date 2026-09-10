package com.apm.insight.l;

import android.os.Debug;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f10218a = new b(0);

    public static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.c.a
        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f10218a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f10218a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f10218a.c(memoryInfo);
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static Long a(Map<? super String, Long> map, String str, Long l2) {
            if (str == null || map == null) {
                return -1L;
            }
            Long l3 = map.get(str);
            if (l3 != null) {
                l2 = Long.valueOf(l2.longValue() + l3.longValue());
            }
            map.put(str, l2);
            return l2;
        }

        public static Float a(Map<? super String, Float> map) {
            float fFloatValue = 0.0f;
            for (Float f : map.values()) {
                if (f != null) {
                    fFloatValue = f.floatValue() + fFloatValue;
                }
            }
            return Float.valueOf(fFloatValue);
        }

        public static int a(Object obj, int i2) {
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                if (obj instanceof String) {
                    try {
                        return Integer.parseInt(String.valueOf(obj));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i2;
        }
    }
}
