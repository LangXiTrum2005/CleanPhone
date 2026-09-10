package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3277dg implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2851Wd f4284a;
    public final /* synthetic */ int b;

    public C3277dg(InterfaceC2851Wd interfaceC2851Wd, int i) {
        this.f4284a = interfaceC2851Wd;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3188cg c3188cg;
        Object obj2;
        if (interfaceC2857Wj instanceof C3188cg) {
            c3188cg = (C3188cg) interfaceC2857Wj;
            int i = c3188cg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3188cg.c = i - Integer.MIN_VALUE;
            } else {
                c3188cg = new C3188cg(this, interfaceC2857Wj);
            }
        } else {
            c3188cg = new C3188cg(this, interfaceC2857Wj);
        }
        Object obj3 = c3188cg.f4236a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c3188cg.c;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3375el.b0(obj3);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj3);
            }
        }
        AbstractC3375el.b0(obj3);
        C3153cD c3153cD = new C3153cD(this.b, obj);
        c3188cg.c = 1;
        if (this.f4284a.g(c3153cD, c3188cg) == enumC4602sk) {
            return enumC4602sk;
        }
        c3188cg.c = 2;
        InterfaceC3549gk context = c3188cg.getContext();
        AbstractC2995aW.w(context);
        InterfaceC2857Wj interfaceC2857WjW = WD.w(c3188cg);
        C4085mp c4085mp = interfaceC2857WjW instanceof C4085mp ? (C4085mp) interfaceC2857WjW : null;
        if (c4085mp == null) {
            obj2 = c5033xf0;
        } else {
            AbstractC3899kk abstractC3899kk = c4085mp.d;
            if (abstractC3899kk.isDispatchNeeded(context)) {
                c4085mp.f = c5033xf0;
                c4085mp.c = 1;
                abstractC3899kk.dispatchYield(context, c4085mp);
            } else {
                C3816jm0 c3816jm0 = new C3816jm0(C3816jm0.b);
                InterfaceC3549gk interfaceC3549gkPlus = context.plus(c3816jm0);
                c4085mp.f = c5033xf0;
                c4085mp.c = 1;
                abstractC3899kk.dispatchYield(interfaceC3549gkPlus, c4085mp);
                if (c3816jm0.f4570a) {
                    SE se = AbstractC4173np.f4762a;
                    AbstractC3210cs abstractC3210csA = AbstractC3270dc0.a();
                    S5 s5 = abstractC3210csA.c;
                    if (s5 != null && !s5.isEmpty()) {
                        if (abstractC3210csA.q()) {
                            c4085mp.f = c5033xf0;
                            c4085mp.c = 1;
                            abstractC3210csA.i(c4085mp);
                        } else {
                            abstractC3210csA.o(true);
                            try {
                                c4085mp.run();
                                do {
                                } while (abstractC3210csA.t());
                            } catch (Throwable th) {
                                try {
                                    c4085mp.h(th, null);
                                } catch (Throwable th2) {
                                    abstractC3210csA.g(true);
                                    throw th2;
                                }
                            }
                            abstractC3210csA.g(true);
                        }
                    }
                    obj2 = c5033xf0;
                }
            }
            obj2 = enumC4602sk;
        }
        if (obj2 != enumC4602sk) {
            obj2 = c5033xf0;
        }
        return obj2 == enumC4602sk ? enumC4602sk : c5033xf0;
    }
}
