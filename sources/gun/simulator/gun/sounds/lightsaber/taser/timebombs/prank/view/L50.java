package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.CheckBox;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySettingBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class L50 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CheckBox f3337a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SettingActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L50(SettingActivity settingActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.d = settingActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        L50 l50 = new L50(this.d, interfaceC2857Wj);
        l50.c = obj;
        return l50;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((L50) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x01c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        InterfaceC4514rk interfaceC4514rk;
        CheckBox checkBox;
        CheckBox checkBox2;
        CheckBox checkBox3;
        CheckBox checkBox4;
        CheckBox checkBox5;
        CheckBox checkBox6;
        CheckBox checkBox7;
        CheckBox checkBox8;
        CheckBox checkBox9;
        Object objX;
        CheckBox checkBox10;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        int i2 = 8;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        int i6 = 4;
        int i7 = 3;
        int i8 = 1;
        int i9 = 2;
        SettingActivity settingActivity = this.d;
        switch (i) {
            case 0:
                AbstractC3375el.b0(obj);
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                checkBox = ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash;
                C50 c50 = new C50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox;
                this.b = 1;
                obj = WD.X(c50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox.setChecked(((Boolean) obj).booleanValue());
                checkBox2 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash;
                D50 d50 = new D50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox2;
                this.b = 2;
                obj = WD.X(d50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox2.setChecked(((Boolean) obj).booleanValue());
                checkBox3 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic;
                E50 e50 = new E50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox3;
                this.b = 3;
                obj = WD.X(e50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox3.setChecked(((Boolean) obj).booleanValue());
                checkBox4 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound;
                F50 f50 = new F50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox4;
                this.b = 4;
                obj = WD.X(f50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox4.setChecked(((Boolean) obj).booleanValue());
                checkBox5 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet;
                G50 g50 = new G50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox5;
                this.b = 5;
                obj = WD.X(g50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h50 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i50 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j50 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j50, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k50 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k50, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 1:
                checkBox = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox.setChecked(((Boolean) obj).booleanValue());
                checkBox2 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash;
                D50 d51 = new D50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox2;
                this.b = 2;
                obj = WD.X(d51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox2.setChecked(((Boolean) obj).booleanValue());
                checkBox3 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic;
                E50 e51 = new E50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox3;
                this.b = 3;
                obj = WD.X(e51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox3.setChecked(((Boolean) obj).booleanValue());
                checkBox4 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound;
                F50 f51 = new F50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox4;
                this.b = 4;
                obj = WD.X(f51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox4.setChecked(((Boolean) obj).booleanValue());
                checkBox5 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet;
                G50 g51 = new G50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox5;
                this.b = 5;
                obj = WD.X(g51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h51 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i51 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j51 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j51, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k51 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k51, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 2:
                checkBox2 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox2.setChecked(((Boolean) obj).booleanValue());
                checkBox3 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic;
                E50 e52 = new E50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox3;
                this.b = 3;
                obj = WD.X(e52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox3.setChecked(((Boolean) obj).booleanValue());
                checkBox4 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound;
                F50 f52 = new F50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox4;
                this.b = 4;
                obj = WD.X(f52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox4.setChecked(((Boolean) obj).booleanValue());
                checkBox5 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet;
                G50 g52 = new G50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox5;
                this.b = 5;
                obj = WD.X(g52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h52 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i52 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j52 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j52, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k52 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k52, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 3:
                checkBox3 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox3.setChecked(((Boolean) obj).booleanValue());
                checkBox4 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound;
                F50 f53 = new F50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox4;
                this.b = 4;
                obj = WD.X(f53, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox4.setChecked(((Boolean) obj).booleanValue());
                checkBox5 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet;
                G50 g53 = new G50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox5;
                this.b = 5;
                obj = WD.X(g53, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h53 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h53, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i53 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i53, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j53 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j53, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k53 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k53, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 4:
                checkBox4 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox4.setChecked(((Boolean) obj).booleanValue());
                checkBox5 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet;
                G50 g54 = new G50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox5;
                this.b = 5;
                obj = WD.X(g54, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h54 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h54, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i54 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i54, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j54 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j54, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k54 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k54, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 5:
                checkBox5 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox5.setChecked(((Boolean) obj).booleanValue());
                checkBox6 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound;
                H50 h55 = new H50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox6;
                this.b = 6;
                obj = WD.X(h55, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i55 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i55, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j55 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j55, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k55 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k55, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 6:
                checkBox6 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox6.setChecked(((Boolean) obj).booleanValue());
                checkBox7 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion;
                I50 i56 = new I50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox7;
                this.b = 7;
                obj = WD.X(i56, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j56 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j56, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k56 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k56, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 7:
                checkBox7 = this.f3337a;
                interfaceC4514rk = (InterfaceC4514rk) this.c;
                AbstractC3375el.b0(obj);
                checkBox7.setChecked(((Boolean) obj).booleanValue());
                checkBox8 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound;
                J50 j57 = new J50(2, null);
                this.c = interfaceC4514rk;
                this.f3337a = checkBox8;
                this.b = 8;
                obj = WD.X(j57, AbstractC4437qp.b, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k57 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k57, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 8:
                checkBox8 = this.f3337a;
                AbstractC3375el.b0(obj);
                checkBox8.setChecked(((Boolean) obj).booleanValue());
                checkBox9 = ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm;
                K50 k58 = new K50(2, null);
                this.c = checkBox9;
                this.f3337a = null;
                this.b = 9;
                objX = WD.X(k58, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                checkBox10 = checkBox9;
                obj = objX;
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            case 9:
                checkBox10 = (CheckBox) this.c;
                AbstractC3375el.b0(obj);
                checkBox10.setChecked(((Boolean) obj).booleanValue());
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFlash.setOnCheckedChangeListener(new B50(settingActivity, 0));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchScreenFlash.setOnCheckedChangeListener(new B50(settingActivity, i8));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchHaptic.setOnCheckedChangeListener(new B50(settingActivity, i9));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchFiringSound.setOnCheckedChangeListener(new B50(settingActivity, i7));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBullet.setOnCheckedChangeListener(new B50(settingActivity, i6));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchShakeSound.setOnCheckedChangeListener(new B50(settingActivity, i5));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchExplosion.setOnCheckedChangeListener(new B50(settingActivity, i4));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchClickSound.setOnCheckedChangeListener(new B50(settingActivity, i3));
                ((ActivitySettingBinding) settingActivity.getMBinding()).switchBgm.setOnCheckedChangeListener(new B50(settingActivity, i2));
                return C5033xf0.f5238a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
