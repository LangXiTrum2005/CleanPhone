package om;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f47571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.a f47572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f47573c;

    public h(l lVar, jk.a aVar) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.f47573c = k.f47577a;
        this.f47571a = lVar;
        this.f47572b = aVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 == 2 || i10 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public bc.i c(boolean z10) {
        bc.i iVarD = this.f47571a.d(null, "in a lazy value");
        if (iVarD != null) {
            return iVarD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // jk.a
    public Object invoke() throws Throwable {
        Object objInvoke;
        bc.i iVarC;
        k kVar = k.f47579c;
        k kVar2 = k.f47578b;
        Object obj = this.f47573c;
        if (!(obj instanceof k)) {
            ym.l.j(obj);
            return obj;
        }
        this.f47571a.f47583a.lock();
        try {
            Object obj2 = this.f47573c;
            if (!(obj2 instanceof k)) {
                ym.l.j(obj2);
                this.f47571a.f47583a.unlock();
                return obj2;
            }
            if (obj2 == kVar2) {
                this.f47573c = kVar;
                bc.i iVarC2 = c(true);
                if (!iVarC2.f5552b) {
                    objInvoke = iVarC2.f5553c;
                } else if (obj2 == kVar) {
                    iVarC = c(false);
                    if (iVarC.f5552b) {
                        this.f47573c = kVar2;
                        try {
                            objInvoke = this.f47572b.invoke();
                            b(objInvoke);
                            this.f47573c = objInvoke;
                        } catch (Throwable th2) {
                            if (ym.l.h(th2)) {
                                this.f47573c = k.f47577a;
                                throw th2;
                            }
                            if (this.f47573c == kVar2) {
                                this.f47573c = new ym.k(th2);
                            }
                            this.f47571a.f47584b.getClass();
                            throw th2;
                        }
                    } else {
                        objInvoke = iVarC.f5553c;
                    }
                } else {
                    this.f47573c = kVar2;
                    objInvoke = this.f47572b.invoke();
                    b(objInvoke);
                    this.f47573c = objInvoke;
                }
            } else if (obj2 == kVar) {
                iVarC = c(false);
                if (iVarC.f5552b) {
                    objInvoke = iVarC.f5553c;
                } else {
                    this.f47573c = kVar2;
                    objInvoke = this.f47572b.invoke();
                    b(objInvoke);
                    this.f47573c = objInvoke;
                }
            } else {
                this.f47573c = kVar2;
                objInvoke = this.f47572b.invoke();
                b(objInvoke);
                this.f47573c = objInvoke;
            }
            this.f47571a.f47583a.unlock();
            return objInvoke;
        } catch (Throwable th3) {
            this.f47571a.f47583a.unlock();
            throw th3;
        }
    }

    public void b(Object obj) {
    }
}
