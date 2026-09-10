package com.mbridge.msdk.newreward.function.command;

import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f1617a;
    private a b;

    public void a(a aVar) {
        this.f1617a = aVar;
    }

    public void b(a aVar) {
        if (this.b == null) {
            this.b = aVar;
        }
    }

    public void c(Object obj) throws MBridgeError {
        if (this.f1617a == null) {
            return;
        }
        b bVar = new b();
        bVar.a(f.CHECK_CAMPAIGN_EXCLUDE_INS);
        bVar.a(obj);
        e eVarA = this.f1617a.a(bVar);
        if (!eVarA.b()) {
            throw ((MBridgeError) eVarA.a());
        }
    }

    public void d(Object obj) {
        if (this.f1617a == null) {
            return;
        }
        b bVar = new b();
        bVar.a(obj);
        bVar.a(f.HANDLER_ALREADY_INSTALL_CAMPAIGN);
        this.f1617a.a(bVar);
    }

    public void e(Object obj) {
        if (this.f1617a == null) {
            return;
        }
        b bVar = new b();
        bVar.a(f.SHOW);
        bVar.a(obj);
        this.f1617a.a(bVar);
    }

    public void f(Object obj) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(f.START_LOAD_CHECK);
        this.f1617a.a(bVar);
    }

    public Object g(Object obj, f fVar) {
        if (this.b == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public Object h(Object obj, f fVar) {
        if (this.b == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public Object i(Object obj, f fVar) {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.newreward.function.command.concretecommand.c();
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public Object j(Object obj, f fVar) {
        if (this.f1617a == null) {
            return Boolean.FALSE;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.f1617a.a(bVar).a();
    }

    public Map a(Object... objArr) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (objArr.length % 2 != 0) {
            return concurrentHashMap;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (i % 2 == 0) {
                Object obj = objArr[i];
                Object obj2 = objArr[i + 1];
                if (obj == null) {
                    obj = "";
                }
                if (obj2 == null) {
                    obj2 = "";
                }
                concurrentHashMap.put(obj, obj2);
            }
        }
        return concurrentHashMap;
    }

    public Object b(Object obj, f fVar) {
        if (this.f1617a == null) {
            return Boolean.FALSE;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.f1617a.a(bVar).a();
    }

    public Object f(Object obj, f fVar) {
        if (this.b == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public void d(Object obj, f fVar) {
        a(obj, fVar, (Object) null);
    }

    public void e(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.f1617a == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a(obj);
        bVar2.a(f.SMART_LOAD);
        this.f1617a.a(bVar2, bVar);
    }

    public void d(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.b == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a((f) ((Map) obj).get("command_type"));
        bVar2.a(obj);
        this.b.a(bVar2, bVar);
    }

    public void b(Object obj) throws MBridgeError {
        if (this.f1617a == null) {
            return;
        }
        b bVar = new b();
        bVar.a(f.CHECK_CAMPAIGN);
        bVar.a(obj);
        e eVarA = this.f1617a.a(bVar);
        if (!eVarA.b()) {
            throw ((MBridgeError) eVarA.a());
        }
    }

    public void c(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.f1617a == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a(obj);
        bVar2.a((f) ((Map) obj).get("command_type"));
        this.f1617a.a(bVar2, bVar);
    }

    public Object a(Object obj, f fVar) {
        if (this.f1617a == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(obj);
        bVar.a(fVar);
        return this.f1617a.a(bVar).a();
    }

    public Object e(Object obj, f fVar) {
        if (this.b == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public void a(Object obj, f fVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.f1617a == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a(obj);
        bVar2.a(fVar);
        this.f1617a.a(bVar2, bVar);
    }

    public Object c(Object obj, f fVar) {
        if (this.b == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(fVar);
        bVar.a(obj);
        return this.b.a(bVar).a();
    }

    public void b(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.b == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a(obj);
        bVar2.a((f) ((Map) obj).get("command_type"));
        this.b.a(bVar2, bVar);
    }

    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (this.f1617a == null) {
            return;
        }
        b bVar2 = new b();
        bVar2.a(obj);
        bVar2.a(f.NORMAL_LOAD);
        this.f1617a.a(bVar2, bVar);
    }

    public Object a(Object obj) {
        if (this.f1617a == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(obj);
        bVar.a(f.CANDIDATE_LOAD_ACTION);
        return this.f1617a.a(bVar).a();
    }

    public void a(Object obj, f fVar, Object obj2) {
        b bVar = new b();
        bVar.a(obj2);
        bVar.a(fVar);
        new com.mbridge.msdk.newreward.function.command.concretecommand.b(obj).a(bVar);
    }

    public void a(Object obj, String str) {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.newreward.function.command.concretecommand.c();
        }
        b bVar = new b();
        bVar.a(obj);
        this.b.a(bVar, str);
    }
}
