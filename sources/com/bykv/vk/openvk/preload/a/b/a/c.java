package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f232a = new r() { // from class: com.bykv.vk.openvk.preload.a.b.a.c.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == Date.class) {
                return new c();
            }
            return null;
        }
    };
    private final List<DateFormat> b;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.bykv.vk.openvk.preload.a.b.d.b()) {
            arrayList.add(com.bykv.vk.openvk.preload.falconx.a.a.a(2, 2));
        }
    }

    private synchronized Date a(String str) {
        Iterator<DateFormat> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return com.bykv.vk.openvk.preload.a.b.a.a.a.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new o(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) throws IOException {
        try {
            if (date == null) {
                cVar.h();
            } else {
                cVar.b(this.b.get(0).format(date));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ Date a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        return a(aVar.h());
    }
}
