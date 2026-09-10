package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3390ew extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4342a;
    public final /* synthetic */ InterfaceC4989x60 b;
    public final /* synthetic */ InterfaceC4443qv c;
    public final /* synthetic */ InterfaceC4221oQ d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3390ew(InterfaceC4989x60 interfaceC4989x60, InterfaceC4443qv interfaceC4443qv, InterfaceC4221oQ interfaceC4221oQ, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = interfaceC4989x60;
        this.c = interfaceC4443qv;
        this.d = interfaceC4221oQ;
        this.e = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3390ew(this.b, this.c, this.d, this.e, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3390ew) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4706tv c4706tv;
        Object obj2 = EnumC4602sk.f4993a;
        int i = this.f4342a;
        Object obj3 = C5033xf0.f5238a;
        InterfaceC4443qv interfaceC4443qv = this.c;
        InterfaceC4221oQ interfaceC4221oQ = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC3375el.b0(obj);
                    this.f4342a = 3;
                    if (interfaceC4443qv.collect(interfaceC4221oQ, this) == obj2) {
                        return obj2;
                    }
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC3375el.b0(obj);
        } else {
            AbstractC3375el.b0(obj);
            C4467r90 c4467r90 = G7.h;
            InterfaceC4989x60 interfaceC4989x60 = this.b;
            if (interfaceC4989x60 == c4467r90) {
                this.f4342a = 1;
                if (interfaceC4443qv.collect(interfaceC4221oQ, this) == obj2) {
                    return obj2;
                }
            } else {
                InterfaceC2857Wj interfaceC2857Wj = null;
                if (interfaceC4989x60 == G7.i) {
                    C4408qa0 c4408qa0G = ((V) interfaceC4221oQ).g();
                    C3214cw c3214cw = new C3214cw(2, null);
                    this.f4342a = 2;
                    if (AbstractC3375el.z(c4408qa0G, c3214cw, this) == obj2) {
                        return obj2;
                    }
                    this.f4342a = 3;
                    if (interfaceC4443qv.collect(interfaceC4221oQ, this) == obj2) {
                        return obj2;
                    }
                } else {
                    C4408qa0 c4408qa0G2 = ((V) interfaceC4221oQ).g();
                    switch (((C4467r90) interfaceC4989x60).f4920a) {
                        case 0:
                            c4706tv = new C4706tv();
                            break;
                        default:
                            c4706tv = new C4706tv(new C4643t90(c4408qa0G2, null));
                            break;
                    }
                    boolean z = c4706tv instanceof InterfaceC4731u90;
                    InterfaceC4443qv c5052xp = c4706tv;
                    if (!z) {
                        C5058xv c5058xv = C5058xv.f;
                        C4970wv c4970wv = C4970wv.f;
                        if (c4706tv instanceof C5052xp) {
                            C5052xp c5052xp2 = (C5052xp) c4706tv;
                            if (c5052xp2.b != c5058xv || c5052xp2.c != c4970wv) {
                                c5052xp = c4706tv;
                                c5052xp = new C5052xp(c4706tv);
                            }
                        } else {
                            c5052xp = c4706tv;
                            c5052xp = new C5052xp(c4706tv);
                        }
                    }
                    c5052xp = c4706tv;
                    InterfaceC4443qv interfaceC4443qv2 = c5052xp;
                    C3302dw c3302dw = new C3302dw(interfaceC4443qv, interfaceC4221oQ, this.e, null);
                    this.f4342a = 4;
                    int i2 = AbstractC2817Uv.f3849a;
                    C2791Tv c2791Tv = new C2791Tv(c3302dw, interfaceC2857Wj, 0);
                    C2734Rq c2734Rq = C2734Rq.f3684a;
                    EnumC5024xb enumC5024xb = EnumC5024xb.f5229a;
                    Object objCollect = new C3625he(c2791Tv, interfaceC4443qv2, c2734Rq, -2, enumC5024xb).f(c2734Rq, 0, enumC5024xb).collect(PR.f3552a, this);
                    if (objCollect != obj2) {
                        objCollect = obj3;
                    }
                    if (objCollect != obj2) {
                        objCollect = obj3;
                    }
                    if (objCollect == obj2) {
                        return obj2;
                    }
                }
            }
        }
        return obj3;
    }
}
