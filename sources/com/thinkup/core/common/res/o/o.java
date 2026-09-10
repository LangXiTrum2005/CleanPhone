package com.thinkup.core.common.res.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.res.o0;
import com.thinkup.core.common.res.oo;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String m = "H5TemplateLoader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile o f42372n;
    Context o;
    private final ConcurrentHashMap<String, List<InterfaceC0695o>> o0 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> oo = new ConcurrentHashMap<>();

    public static class m {
        public static final int m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42375n = 3;
        public static final int o = 1;
        public static final int o0 = 4;
        public static final int om = 6;
        public static final int on = 7;
        public static final int oo = 5;
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.o.o$o, reason: collision with other inner class name */
    public interface InterfaceC0695o {
        void m();

        void o();
    }

    private o(Context context) {
        if (context != null) {
            this.o = context.getApplicationContext();
        } else {
            this.o = o0n.m().on();
        }
    }

    private void m(String str) {
        String strO = o0.o(this.o).o(str);
        if (TextUtils.isEmpty(strO)) {
            o(str, 3, "h5temp html file not exist");
        } else {
            o(str, strO);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.o.o$3, reason: invalid class name */
    public class AnonymousClass3 implements com.thinkup.core.common.res.o.m.o {
        final /* synthetic */ oo o;

        public AnonymousClass3(oo ooVar) {
            this.o = ooVar;
        }

        @Override // com.thinkup.core.common.res.o.m.o
        public final void o(oo ooVar) {
            String str = ooVar.m0;
            o.this.o(this.o.m0);
        }

        @Override // com.thinkup.core.common.res.o.m.o
        public final void o(oo ooVar, String str) {
            o.this.o(ooVar.m0, 1, str);
        }
    }

    private static o o(Context context) {
        if (f42372n == null) {
            synchronized (o.class) {
                try {
                    if (f42372n == null) {
                        f42372n = new o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42372n;
    }

    private void o(String str, String str2) {
        final String str3;
        final String str4;
        synchronized (this.o0) {
            File file = new File(o0.o(this.o).m(5, nm.o(str)));
            if (file.exists()) {
                file.delete();
            }
            try {
                LinkedList<InterfaceC0695o> linkedList = (LinkedList) this.o0.remove(str);
                if (linkedList != null) {
                    Long l2 = this.oo.get(str);
                    final long jCurrentTimeMillis = l2 != null ? System.currentTimeMillis() - l2.longValue() : 0L;
                    for (final InterfaceC0695o interfaceC0695o : linkedList) {
                        if (interfaceC0695o != null) {
                            str3 = str;
                            str4 = str2;
                            o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.res.o.o.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TextUtils.isEmpty(str4);
                                }
                            });
                        } else {
                            str3 = str;
                            str4 = str2;
                        }
                        str2 = str4;
                        str = str3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, int i2, String str2) {
        final String str3;
        final int i3;
        final String str4;
        synchronized (this.o0) {
            try {
                String strO = nm.o(str);
                File file = new File(o0.o(this.o).m(5, strO));
                if (file.exists()) {
                    file.delete();
                }
                File file2 = new File(o0.o(this.o).m(6, strO));
                if (file2.exists()) {
                    file2.delete();
                }
                LinkedList<InterfaceC0695o> linkedList = (LinkedList) this.o0.remove(str);
                if (linkedList != null) {
                    for (final InterfaceC0695o interfaceC0695o : linkedList) {
                        if (interfaceC0695o != null) {
                            str3 = str;
                            i3 = i2;
                            str4 = str2;
                            o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.res.o.o.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                }
                            });
                        } else {
                            str3 = str;
                            i3 = i2;
                            str4 = str2;
                        }
                        str = str3;
                        i2 = i3;
                        str2 = str4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(String str, InterfaceC0695o interfaceC0695o) {
        if (interfaceC0695o != null && !TextUtils.isEmpty(str) && str.endsWith(".zip") && TextUtils.isEmpty(o0.o(o0n.m().on()).o(str))) {
            synchronized (this.o0) {
                try {
                    if (!this.oo.contains(str)) {
                        this.oo.put(str, Long.valueOf(System.currentTimeMillis()));
                    }
                    if (!this.o0.containsKey(str)) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(interfaceC0695o);
                        this.o0.put(str, linkedList);
                        String strO = nm.o(str);
                        if (TextUtils.isEmpty(strO) ? false : new File(o0.o(o0n.m().on()).m(5, strO)).exists()) {
                            o(str);
                        } else {
                            oo ooVar = new oo(5, str);
                            com.thinkup.core.common.res.o.m mVar = new com.thinkup.core.common.res.o.m(ooVar);
                            mVar.m = new AnonymousClass3(ooVar);
                            mVar.o0();
                        }
                        return;
                    }
                    LinkedList linkedList2 = (LinkedList) this.o0.get(str);
                    if (linkedList2 != null && !linkedList2.contains(interfaceC0695o)) {
                        linkedList2.add(interfaceC0695o);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void o(oo ooVar) {
        com.thinkup.core.common.res.o.m mVar = new com.thinkup.core.common.res.o.m(ooVar);
        mVar.m = new AnonymousClass3(ooVar);
        mVar.o0();
    }

    private void o() {
        try {
            ConcurrentHashMap<String, List<InterfaceC0695o>> concurrentHashMap = this.o0;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        String strO = nm.o(str);
        String strM = o0.o(this.o).m(5, strO);
        String strM2 = o0.o(this.o).m(6, strO);
        File file = new File(strM2);
        if (file.exists()) {
            file.delete();
        }
        new com.thinkup.core.common.ooo.o();
        if (com.thinkup.core.common.ooo.o.o(strM, strM2) == 0) {
            m(str);
        } else {
            o(str, 2, "H5temp url unzip fail");
        }
    }
}
