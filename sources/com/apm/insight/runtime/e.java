package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f10325b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f10327a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f10327a == null) {
                this.f10327a = Header.b(com.apm.insight.e.g());
            }
            return this.f10327a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10326a;

    public e() {
        this(f10325b);
    }

    public Object a(String str) {
        e eVar = this.f10326a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f10326a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f10326a = eVar;
    }
}
