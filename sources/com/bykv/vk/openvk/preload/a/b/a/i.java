package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f241a = new r() { // from class: com.bykv.vk.openvk.preload.a.b.a.i.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == Date.class) {
                return new i();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        try {
            return new Date(this.b.parse(aVar.h()).getTime());
        } catch (ParseException e) {
            throw new o(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) throws IOException {
        cVar.b(date == null ? null : this.b.format((java.util.Date) date));
    }
}
