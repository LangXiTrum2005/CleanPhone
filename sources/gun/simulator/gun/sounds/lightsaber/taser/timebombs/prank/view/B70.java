package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class B70 extends F70 {
    public final /* synthetic */ int b;
    public final Array c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B70(TextureAtlas textureAtlas, int i) {
        super(textureAtlas);
        this.b = i;
        if (i != 1) {
            this.c = new Array();
        } else {
            super(textureAtlas);
            this.c = new Array();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v98 */
    public static C3493g5 b(C5167z70 c5167z70, String str, D70 d70) throws IOException {
        int i;
        boolean z;
        int length;
        float[] fArr;
        int i2;
        U4 u4;
        int i3;
        ?? r1;
        int i4;
        int i5;
        TT tt;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        X4 x4;
        X4 x5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        X4 x6;
        int i17;
        X4 x7;
        int i18;
        boolean z2 = true;
        Array array = new Array(c5167z70.readInt(true));
        int i19 = c5167z70.readInt(true);
        int i20 = 0;
        while (true) {
            byte b = 5;
            byte b2 = 4;
            byte b3 = 3;
            byte b4 = 2;
            if (i20 >= i19) {
                break;
            }
            int i21 = c5167z70.readInt(z2);
            int i22 = c5167z70.readInt(z2);
            int i23 = 0;
            while (i23 < i22) {
                byte b5 = c5167z70.readByte();
                int i24 = c5167z70.readInt(z2);
                int i25 = i24 - 1;
                if (b5 == 0) {
                    i23 = i23;
                    i22 = i22;
                    i11 = i19;
                    i12 = i21;
                    R4 r4 = new R4(i24, i12);
                    for (int i26 = 0; i26 < i24; i26++) {
                        float f = c5167z70.readFloat();
                        String strH = c5167z70.h();
                        r4.b[i26] = f;
                        r4.d[i26] = strH;
                    }
                    array.add(r4);
                } else if (b5 == z2) {
                    i23 = i23;
                    i22 = i22;
                    i11 = i19;
                    i12 = i21;
                    int i27 = 4;
                    X4 x8 = new X4(i24, c5167z70.readInt(true), i12, 4);
                    float f2 = c5167z70.readFloat();
                    float f3 = c5167z70.read() / 255.0f;
                    float f4 = c5167z70.read() / 255.0f;
                    float f5 = c5167z70.read() / 255.0f;
                    float f6 = c5167z70.read() / 255.0f;
                    int i28 = 0;
                    int i29 = 0;
                    while (true) {
                        int i30 = i28 * 5;
                        float[] fArr2 = x8.b;
                        fArr2[i30] = f2;
                        fArr2[i30 + 1] = f3;
                        fArr2[i30 + 2] = f4;
                        fArr2[i30 + 3] = f5;
                        fArr2[i30 + i27] = f6;
                        if (i28 == i25) {
                            break;
                        }
                        float f7 = c5167z70.readFloat();
                        float f8 = c5167z70.read() / 255.0f;
                        float f9 = c5167z70.read() / 255.0f;
                        float f10 = c5167z70.read() / 255.0f;
                        float f11 = c5167z70.read() / 255.0f;
                        byte b6 = c5167z70.readByte();
                        if (b6 == 1) {
                            i13 = i28;
                            x8.h(i13);
                        } else if (b6 != 2) {
                            i13 = i28;
                        } else {
                            float f12 = f2;
                            int i31 = i28;
                            q(c5167z70, x8, i29, i28, 0, f12, f7, f3, f8);
                            q(c5167z70, x8, i29 + 1, i31, 1, f12, f7, f4, f9);
                            int i32 = i29 + 3;
                            q(c5167z70, x8, i29 + 2, i31, 2, f12, f7, f5, f10);
                            i29 += 4;
                            q(c5167z70, x8, i32, i31, 3, f12, f7, f6, f11);
                            i13 = i31;
                        }
                        i28 = i13 + 1;
                        f2 = f7;
                        f3 = f8;
                        f4 = f9;
                        f5 = f10;
                        f6 = f11;
                        i27 = 4;
                    }
                    array.add(x8);
                } else if (b5 != b4) {
                    if (b5 == b3) {
                        i15 = i21;
                        X4 x9 = new X4(i24, c5167z70.readInt(z2), i15, 3);
                        float f13 = c5167z70.readFloat();
                        float f14 = c5167z70.read() / 255.0f;
                        float f15 = c5167z70.read() / 255.0f;
                        float f16 = f15;
                        float f17 = c5167z70.read() / 255.0f;
                        float f18 = c5167z70.read() / 255.0f;
                        float f19 = c5167z70.read() / 255.0f;
                        float f20 = c5167z70.read() / 255.0f;
                        float f21 = c5167z70.read() / 255.0f;
                        int i33 = 0;
                        int i34 = 0;
                        float f22 = f13;
                        float f23 = f14;
                        while (true) {
                            x9.j(f22, f23, f16, f17, f18, f19, f20, f21, i33);
                            if (i33 == i25) {
                                break;
                            }
                            float f24 = c5167z70.readFloat();
                            float f25 = c5167z70.read() / 255.0f;
                            float f26 = c5167z70.read() / 255.0f;
                            float f27 = c5167z70.read() / 255.0f;
                            float f28 = c5167z70.read() / 255.0f;
                            float f29 = c5167z70.read() / 255.0f;
                            float f30 = c5167z70.read() / 255.0f;
                            float f31 = c5167z70.read() / 255.0f;
                            byte b7 = c5167z70.readByte();
                            if (b7 == 1) {
                                i16 = i33;
                                x6 = x9;
                                x6.h(i16);
                            } else if (b7 != 2) {
                                i16 = i33;
                                x6 = x9;
                            } else {
                                int i35 = i33;
                                int i36 = i33;
                                float f32 = f22;
                                X4 x10 = x9;
                                q(c5167z70, x9, i34, i35, 0, f32, f24, f23, f25);
                                q(c5167z70, x10, i34 + 1, i36, 1, f32, f24, f16, f26);
                                q(c5167z70, x10, i34 + 2, i36, 2, f32, f24, f17, f27);
                                q(c5167z70, x10, i34 + 3, i36, 3, f32, f24, f18, f28);
                                q(c5167z70, x10, i34 + 4, i36, 4, f32, f24, f19, f29);
                                int i37 = i34 + 6;
                                q(c5167z70, x10, i34 + 5, i36, 5, f32, f24, f20, f30);
                                i34 += 7;
                                q(c5167z70, x10, i37, i36, 6, f32, f24, f21, f31);
                                x6 = x10;
                                i16 = i36;
                            }
                            i33 = i16 + 1;
                            x9 = x6;
                            i15 = i15;
                            f22 = f24;
                            f23 = f25;
                            f16 = f26;
                            f17 = f27;
                            f18 = f28;
                            f19 = f29;
                            f20 = f30;
                            f21 = f31;
                            i19 = i19;
                        }
                        array.add(x9);
                    } else if (b5 != b2) {
                        if (b5 == b) {
                            Q4 q4 = new Q4(i24, c5167z70.readInt(z2), i21, 0);
                            float f33 = c5167z70.readFloat();
                            float f34 = c5167z70.read() / 255.0f;
                            int i38 = 0;
                            int i39 = 0;
                            while (true) {
                                int i40 = i38 << 1;
                                float[] fArr3 = q4.b;
                                fArr3[i40] = f33;
                                fArr3[i40 + 1] = f34;
                                if (i38 == i25) {
                                    break;
                                }
                                float f35 = c5167z70.readFloat();
                                float f36 = c5167z70.read() / 255.0f;
                                byte b8 = c5167z70.readByte();
                                if (b8 == z2) {
                                    i18 = i21;
                                    q4.h(i38);
                                } else if (b8 != b4) {
                                    i18 = i21;
                                } else {
                                    Q4 q5 = q4;
                                    int i41 = i38;
                                    i18 = i21;
                                    q(c5167z70, q5, i39, i41, 0, f33, f35, f34, f36);
                                    i39++;
                                    q4 = q5;
                                    i38 = i41;
                                }
                                i38++;
                                f33 = f35;
                                f34 = f36;
                                i23 = i23;
                                i22 = i22;
                                i21 = i18;
                                b4 = 2;
                            }
                            array.add(q4);
                        }
                        i23 = i23;
                        i22 = i22;
                        i11 = i19;
                        i12 = i21;
                    } else {
                        i15 = i21;
                        X4 x11 = new X4(i24, c5167z70.readInt(z2), i15, 2);
                        float f37 = c5167z70.readFloat();
                        float f38 = c5167z70.read() / 255.0f;
                        float f39 = f37;
                        float f40 = c5167z70.read() / 255.0f;
                        float f41 = c5167z70.read() / 255.0f;
                        float f42 = c5167z70.read() / 255.0f;
                        float f43 = c5167z70.read() / 255.0f;
                        float f44 = c5167z70.read() / 255.0f;
                        int i42 = 0;
                        int i43 = 0;
                        float f45 = f38;
                        while (true) {
                            x11.k(f39, f45, f40, f41, f42, f43, f44, i42);
                            if (i42 == i25) {
                                break;
                            }
                            float f46 = c5167z70.readFloat();
                            float f47 = c5167z70.read() / 255.0f;
                            float f48 = c5167z70.read() / 255.0f;
                            float f49 = c5167z70.read() / 255.0f;
                            float f50 = c5167z70.read() / 255.0f;
                            float f51 = c5167z70.read() / 255.0f;
                            float f52 = c5167z70.read() / 255.0f;
                            byte b9 = c5167z70.readByte();
                            if (b9 == z2) {
                                i17 = i42;
                                x7 = x11;
                                x7.h(i17);
                            } else if (b9 != 2) {
                                i17 = i42;
                                x7 = x11;
                            } else {
                                int i44 = i42;
                                int i45 = i42;
                                float f53 = f39;
                                X4 x12 = x11;
                                q(c5167z70, x11, i43, i44, 0, f53, f46, f45, f47);
                                q(c5167z70, x12, i43 + 1, i45, 1, f53, f46, f40, f48);
                                q(c5167z70, x12, i43 + 2, i45, 2, f53, f46, f41, f49);
                                q(c5167z70, x12, i43 + 3, i45, 3, f53, f46, f42, f50);
                                int i46 = i43 + 5;
                                q(c5167z70, x12, i43 + 4, i45, 4, f53, f46, f43, f51);
                                i43 += 6;
                                q(c5167z70, x12, i46, i45, 5, f53, f46, f44, f52);
                                i17 = i45;
                                x7 = x12;
                            }
                            i42 = i17 + 1;
                            x11 = x7;
                            f39 = f46;
                            f45 = f47;
                            f40 = f48;
                            f41 = f49;
                            f42 = f50;
                            f43 = f51;
                            f44 = f52;
                            i15 = i15;
                        }
                        array.add(x11);
                    }
                    i11 = i19;
                    i12 = i15;
                } else {
                    i23 = i23;
                    i22 = i22;
                    i11 = i19;
                    i12 = i21;
                    X4 x13 = new X4(i24, c5167z70.readInt(true), i12, 5);
                    float f54 = c5167z70.readFloat();
                    float f55 = c5167z70.read() / 255.0f;
                    float f56 = c5167z70.read() / 255.0f;
                    float f57 = c5167z70.read() / 255.0f;
                    int i47 = 0;
                    int i48 = 0;
                    while (true) {
                        x13.l(i47, f54, f55, f56, f57);
                        if (i47 == i25) {
                            break;
                        }
                        float f58 = c5167z70.readFloat();
                        float f59 = c5167z70.read() / 255.0f;
                        float f60 = c5167z70.read() / 255.0f;
                        float f61 = c5167z70.read() / 255.0f;
                        byte b10 = c5167z70.readByte();
                        if (b10 == 1) {
                            i14 = i47;
                            x13.h(i14);
                        } else if (b10 != 2) {
                            i14 = i47;
                        } else {
                            float f62 = f54;
                            int i49 = i47;
                            q(c5167z70, x13, i48, i47, 0, f62, f58, f55, f59);
                            int i50 = i48 + 2;
                            q(c5167z70, x13, i48 + 1, i49, 1, f62, f58, f56, f60);
                            i48 += 3;
                            q(c5167z70, x13, i50, i49, 2, f62, f58, f57, f61);
                            i14 = i49;
                        }
                        i47 = i14 + 1;
                        f54 = f58;
                        f55 = f59;
                        f56 = f60;
                        f57 = f61;
                    }
                    array.add(x13);
                }
                i23++;
                i21 = i12;
                i22 = i22;
                i19 = i11;
                b4 = 2;
                b3 = 3;
                b2 = 4;
                b = 5;
                z2 = true;
            }
            i20++;
            z2 = true;
        }
        boolean z3 = true;
        int i51 = c5167z70.readInt(true);
        int i52 = 0;
        while (i52 < i51) {
            int i53 = c5167z70.readInt(z3);
            int i54 = c5167z70.readInt(z3);
            int i55 = 0;
            while (i55 < i54) {
                byte b11 = c5167z70.readByte();
                int i56 = c5167z70.readInt(z3);
                if (b11 == 10) {
                    Y4 y4 = new Y4(i56, i53);
                    for (int i57 = 0; i57 < i56; i57++) {
                        float f63 = c5167z70.readFloat();
                        EnumC3531gb enumC3531gb = EnumC3531gb.d[c5167z70.readByte()];
                        int i58 = i57 * 2;
                        float[] fArr4 = y4.b;
                        fArr4[i58] = f63;
                        fArr4[i58 + 1] = enumC3531gb.ordinal();
                    }
                    array.add(y4);
                } else {
                    int i59 = c5167z70.readInt(true);
                    switch (b11) {
                        case 0:
                            m(c5167z70, array, new C3140c5(i56, i59, i53));
                            break;
                        case 1:
                            n(c5167z70, array, new C3229d5(i56, i59, i53, 2));
                            break;
                        case 2:
                            m(c5167z70, array, new Q4(i56, i59, i53, 7));
                            break;
                        case 3:
                            m(c5167z70, array, new Q4(i56, i59, i53, 8));
                            break;
                        case 4:
                            n(c5167z70, array, new C3229d5(i56, i59, i53, 0));
                            break;
                        case 5:
                            m(c5167z70, array, new Q4(i56, i59, i53, 3));
                            break;
                        case 6:
                            m(c5167z70, array, new Q4(i56, i59, i53, 4));
                            break;
                        case 7:
                            n(c5167z70, array, new C3229d5(i56, i59, i53, 1));
                            break;
                        case 8:
                            m(c5167z70, array, new Q4(i56, i59, i53, 5));
                            break;
                        case 9:
                            m(c5167z70, array, new Q4(i56, i59, i53, 6));
                            break;
                    }
                    i55++;
                    z3 = true;
                }
                i55++;
                z3 = true;
            }
            i52++;
            z3 = true;
        }
        int i60 = c5167z70.readInt(z3);
        int i61 = 0;
        while (i61 < i60) {
            int i62 = c5167z70.readInt(z3);
            int i63 = c5167z70.readInt(z3);
            int i64 = i63 - 1;
            X4 x14 = new X4(i63, c5167z70.readInt(z3), i62, 0);
            int i65 = c5167z70.read();
            float f64 = c5167z70.readFloat();
            float f65 = f64;
            float f66 = (i65 & 1) != 0 ? (i65 & 2) != 0 ? c5167z70.readFloat() : 1.0f : 0.0f;
            float f67 = (i65 & 4) != 0 ? c5167z70.readFloat() * 1.0f : 0.0f;
            int i66 = 0;
            int i67 = 0;
            while (true) {
                x14.m(i66, f65, f66, f67, (i65 & 8) != 0 ? 1 : -1, (i65 & 16) != 0, (i65 & 32) != 0);
                if (i66 == i64) {
                    break;
                }
                int i68 = c5167z70.read();
                float f68 = c5167z70.readFloat();
                float f69 = (i68 & 1) != 0 ? (i68 & 2) != 0 ? c5167z70.readFloat() : 1.0f : 0.0f;
                float f70 = (i68 & 4) != 0 ? c5167z70.readFloat() * 1.0f : 0.0f;
                if ((i68 & 64) != 0) {
                    x14.h(i66);
                } else {
                    if ((i68 & 128) != 0) {
                        int i69 = i67 + 1;
                        x5 = x14;
                        float f71 = f65;
                        q(c5167z70, x14, i67, i66, 0, f71, f68, f66, f69);
                        i67 += 2;
                        q(c5167z70, x5, i69, i66, 1, f71, f68, f67, f70);
                    }
                    i66++;
                    f65 = f68;
                    f67 = f70;
                    i64 = i64;
                    i65 = i68;
                    x14 = x5;
                    i60 = i60;
                    i61 = i61;
                    f66 = f69;
                }
                x5 = x14;
                i66++;
                f65 = f68;
                f67 = f70;
                i64 = i64;
                i65 = i68;
                x14 = x5;
                i60 = i60;
                i61 = i61;
                f66 = f69;
            }
            array.add(x14);
            i61++;
            z3 = true;
        }
        int i70 = c5167z70.readInt(z3);
        int i71 = 0;
        while (i71 < i70) {
            int i72 = c5167z70.readInt(z3);
            int i73 = c5167z70.readInt(z3);
            int i74 = i73 - 1;
            X4 x15 = new X4(i73, c5167z70.readInt(z3), i72, 6);
            float f72 = c5167z70.readFloat();
            float f73 = c5167z70.readFloat();
            float f74 = f72;
            float f75 = f73;
            float f76 = c5167z70.readFloat();
            float f77 = c5167z70.readFloat();
            float f78 = c5167z70.readFloat();
            float f79 = c5167z70.readFloat();
            float f80 = c5167z70.readFloat();
            int i75 = 0;
            int i76 = 0;
            while (true) {
                x15.k(f74, f75, f76, f77, f78, f79, f80, i75);
                if (i75 == i74) {
                    break;
                }
                float f81 = c5167z70.readFloat();
                float f82 = c5167z70.readFloat();
                float f83 = c5167z70.readFloat();
                float f84 = c5167z70.readFloat();
                float f85 = c5167z70.readFloat();
                float f86 = c5167z70.readFloat();
                float f87 = c5167z70.readFloat();
                byte b12 = c5167z70.readByte();
                if (b12 == 1) {
                    i10 = i75;
                    x4 = x15;
                    x4.h(i10);
                } else if (b12 != 2) {
                    i10 = i75;
                    x4 = x15;
                } else {
                    int i77 = i75;
                    X4 x16 = x15;
                    float f88 = f74;
                    q(c5167z70, x15, i76, i75, 0, f88, f81, f75, f82);
                    q(c5167z70, x16, i76 + 1, i77, 1, f88, f81, f76, f83);
                    q(c5167z70, x16, i76 + 2, i77, 2, f88, f81, f77, f84);
                    q(c5167z70, x16, i76 + 3, i77, 3, f88, f81, f78, f85);
                    int i78 = i76 + 5;
                    q(c5167z70, x16, i76 + 4, i77, 4, f88, f81, f79, f86);
                    i76 += 6;
                    q(c5167z70, x16, i78, i77, 5, f88, f81, f80, f87);
                    x4 = x16;
                    i10 = i77;
                }
                i75 = i10 + 1;
                x15 = x4;
                f74 = f81;
                f76 = f83;
                f77 = f84;
                f78 = f85;
                f79 = f86;
                f80 = f87;
                i70 = i70;
                i74 = i74;
                i71 = i71;
                f75 = f82;
            }
            array.add(x15);
            i71++;
            z3 = true;
        }
        boolean z4 = true;
        int i79 = c5167z70.readInt(true);
        int i80 = 0;
        while (i80 < i79) {
            int i81 = c5167z70.readInt(z4);
            TT tt2 = (TT) d70.j.get(i81);
            int i82 = c5167z70.readInt(z4);
            int i83 = 0;
            while (i83 < i82) {
                byte b13 = c5167z70.readByte();
                int i84 = c5167z70.readInt(r1);
                int i85 = c5167z70.readInt(r1);
                if (b13 == 0) {
                    r1 = z4;
                    i4 = i83;
                    i5 = i82;
                    tt = tt2;
                    i6 = i81;
                    i7 = i80;
                    i8 = i79;
                    Q4 q6 = new Q4(i84, i85, i6, 1);
                    QT qt = tt.f;
                    QT qt2 = QT.f3603a;
                    m(c5167z70, array, q6);
                } else if (b13 != r1) {
                    if (b13 == 2) {
                        X4 x17 = new X4(i84, i85, i81, r1);
                        float f89 = c5167z70.readFloat();
                        float f90 = c5167z70.readFloat();
                        float f91 = c5167z70.readFloat();
                        float f92 = c5167z70.readFloat();
                        int iB = x17.b() - 1;
                        float f93 = f91;
                        float f94 = f92;
                        int i86 = 0;
                        float f95 = f90;
                        float f96 = f89;
                        int i87 = 0;
                        while (true) {
                            x17.l(i87, f96, f95, f93, f94);
                            if (i87 == iB) {
                                array.add(x17);
                            } else {
                                float f97 = c5167z70.readFloat();
                                float f98 = c5167z70.readFloat();
                                float f99 = c5167z70.readFloat();
                                float f100 = c5167z70.readFloat();
                                byte b14 = c5167z70.readByte();
                                if (b14 == 1) {
                                    i9 = i87;
                                    x17.h(i9);
                                } else if (b14 != 2) {
                                    i9 = i87;
                                } else {
                                    int i88 = i87;
                                    float f101 = f96;
                                    q(c5167z70, x17, i86, i87, 0, f101, f97, f95, f98);
                                    int i89 = i86 + 2;
                                    q(c5167z70, x17, i86 + 1, i88, 1, f101, f97, f93, f99);
                                    i86 += 3;
                                    q(c5167z70, x17, i89, i88, 2, f101, f97, f94, f100);
                                    i9 = i88;
                                }
                                i87 = i9 + 1;
                                tt2 = tt2;
                                f96 = f97;
                                f95 = f98;
                                f93 = f99;
                                f94 = f100;
                                i80 = i80;
                                i83 = i83;
                                i82 = i82;
                                iB = iB;
                                i79 = i79;
                                i81 = i81;
                            }
                        }
                    }
                    i4 = i83;
                    i5 = i82;
                    tt = tt2;
                    i6 = i81;
                    i7 = i80;
                    i8 = i79;
                } else {
                    i4 = i83;
                    i5 = i82;
                    tt = tt2;
                    i7 = i80;
                    i8 = i79;
                    i6 = i81;
                    Q4 q7 = new Q4(i84, i85, i6, 2);
                    if (tt.g != ST.f3715a) {
                        ST st = ST.b;
                    }
                    m(c5167z70, array, q7);
                }
                i83 = i4 + 1;
                i81 = i6;
                tt2 = tt;
                i80 = i7;
                i82 = i5;
                i79 = i8;
                r1 = 1;
            }
            r1 = z4;
            i80++;
            z4 = true;
        }
        boolean z5 = true;
        int i90 = c5167z70.readInt(true);
        int i91 = 0;
        while (i91 < i90) {
            int i92 = c5167z70.readInt(z5) - (z5 ? 1 : 0);
            int i93 = c5167z70.readInt(z5);
            int i94 = 0;
            while (i94 < i93) {
                byte b15 = c5167z70.readByte();
                int i95 = c5167z70.readInt(z5);
                if (b15 == 8) {
                    C2963a5 c2963a5 = new C2963a5(i95, i92);
                    for (int i96 = 0; i96 < i95; i96++) {
                        c2963a5.b[i96] = c5167z70.readFloat();
                    }
                    array.add(c2963a5);
                } else {
                    int i97 = c5167z70.readInt(true);
                    if (b15 == 0) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 2));
                    } else if (b15 == 1) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 5));
                    } else if (b15 == 2) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 0));
                    } else if (b15 == 4) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 3));
                    } else if (b15 == 5) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 6));
                    } else if (b15 == 6) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 1));
                    } else if (b15 == 7) {
                        m(c5167z70, array, new Z4(i95, i97, i92, 4));
                    }
                }
                i94++;
                z5 = true;
            }
            i91++;
            z5 = true;
        }
        boolean z6 = true;
        int i98 = c5167z70.readInt(true);
        int i99 = 0;
        while (i99 < i98) {
            I70 i710 = (I70) d70.d.get(c5167z70.readInt(z6));
            int i100 = c5167z70.readInt(z6);
            int i101 = 0;
            while (i101 < i100) {
                int i102 = c5167z70.readInt(z6);
                int i103 = c5167z70.readInt(z6);
                int i104 = 0;
                while (i104 < i103) {
                    String strH2 = c5167z70.h();
                    AbstractC3413f9 abstractC3413f9A = i710.a(i102, strH2);
                    if (abstractC3413f9A == null) {
                        throw new SerializationException(AbstractC3888ke0.i("Timeline attachment not found: ", strH2));
                    }
                    byte b16 = c5167z70.readByte();
                    int i105 = c5167z70.readInt(z6);
                    int i106 = i105 - 1;
                    if (b16 == 0) {
                        i = i103;
                        AbstractC3806jh0 abstractC3806jh0 = (AbstractC3806jh0) abstractC3413f9A;
                        boolean z7 = abstractC3806jh0.e != null;
                        float[] fArr5 = abstractC3806jh0.f;
                        if (z7) {
                            z = true;
                            length = (fArr5.length / 3) << 1;
                        } else {
                            z = true;
                            length = fArr5.length;
                        }
                        i101 = i101;
                        i98 = i98;
                        U4 u5 = new U4(i105, c5167z70.readInt(z), i102, abstractC3806jh0);
                        float f102 = c5167z70.readFloat();
                        int i107 = 0;
                        int i108 = 0;
                        while (true) {
                            int i109 = c5167z70.readInt(z);
                            if (i109 == 0) {
                                fArr = z7 ? new float[length] : fArr5;
                                i102 = i102;
                                i710 = i710;
                            } else {
                                fArr = new float[length];
                                i102 = i102;
                                int i110 = i109 + c5167z70.readInt(true);
                                i710 = i710;
                                for (int i111 = r27; i111 < i110; i111++) {
                                    fArr[i111] = c5167z70.readFloat();
                                }
                                if (!z7) {
                                    for (int i112 = 0; i112 < length; i112++) {
                                        fArr[i112] = fArr[i112] + fArr5[i112];
                                    }
                                }
                            }
                            u5.b[i107] = f102;
                            u5.f[i107] = fArr;
                            if (i107 == i106) {
                                array.add(u5);
                            } else {
                                float f103 = c5167z70.readFloat();
                                byte b17 = c5167z70.readByte();
                                if (b17 == 1) {
                                    i2 = i107;
                                    u4 = u5;
                                    i3 = i;
                                    u4.h(i2);
                                } else if (b17 != 2) {
                                    i2 = i107;
                                    u4 = u5;
                                    i3 = i;
                                } else {
                                    int i113 = i107;
                                    float f104 = f102;
                                    i3 = i;
                                    u4 = u5;
                                    q(c5167z70, u5, i108, i113, 0, f104, f103, 0.0f, 1.0f);
                                    i108++;
                                    i2 = i113;
                                }
                                i107 = i2 + 1;
                                u5 = u4;
                                f102 = f103;
                                fArr5 = fArr5;
                                i710 = i710;
                                i104 = i104;
                                i = i3;
                                length = length;
                                i106 = i106;
                                i102 = i102;
                                z = true;
                            }
                        }
                    } else if (b16 != z6) {
                        i = i103;
                    } else {
                        C3317e5 c3317e5 = new C3317e5(i105, i102, abstractC3413f9A);
                        int i114 = 0;
                        while (i114 < i105) {
                            float f105 = c5167z70.readFloat();
                            int i115 = c5167z70.readInt();
                            EnumC4457r40 enumC4457r40 = EnumC4457r40.b[i115 & 15];
                            float f106 = c5167z70.readFloat();
                            int i116 = i114 * 3;
                            int i117 = i103;
                            float[] fArr6 = c3317e5.b;
                            fArr6[i116] = f105;
                            fArr6[i116 + 1] = enumC4457r40.ordinal() | ((i115 >> 4) << 4);
                            fArr6[i116 + 2] = f106;
                            i114++;
                            i103 = i117;
                        }
                        i = i103;
                        array.add(c3317e5);
                    }
                    i104++;
                    i101 = i101;
                    i103 = i;
                    i98 = i98;
                    i710 = i710;
                    i102 = i102;
                    z6 = true;
                }
                i101++;
                z6 = true;
            }
            i99++;
            z6 = true;
        }
        boolean z8 = true;
        int i118 = c5167z70.readInt(true);
        if (i118 > 0) {
            V4 v4 = new V4(i118);
            int i119 = d70.c.size;
            int i120 = 0;
            while (i120 < i118) {
                float f107 = c5167z70.readFloat();
                int i121 = c5167z70.readInt(z8);
                int[] iArr = new int[i119];
                int i122 = i119 - 1;
                for (int i123 = i122; i123 >= 0; i123--) {
                    iArr[i123] = -1;
                }
                int[] iArr2 = new int[i119 - i121];
                int i124 = 0;
                int i125 = 0;
                int i126 = 0;
                while (true) {
                    int i127 = i118;
                    if (i124 < i121) {
                        int i128 = c5167z70.readInt(true);
                        while (i125 != i128) {
                            iArr2[i126] = i125;
                            i126++;
                            i125++;
                        }
                        iArr[c5167z70.readInt(true) + i125] = i125;
                        i124++;
                        i125++;
                        i118 = i127;
                    } else {
                        while (i125 < i119) {
                            iArr2[i126] = i125;
                            i126++;
                            i125++;
                        }
                        while (i122 >= 0) {
                            if (iArr[i122] == -1) {
                                i126--;
                                iArr[i122] = iArr2[i126];
                            }
                            i122--;
                        }
                        v4.b[i120] = f107;
                        v4.c[i120] = iArr;
                        i120++;
                        i118 = i127;
                        z8 = true;
                    }
                }
            }
            array.add(v4);
            z8 = true;
        }
        int i129 = c5167z70.readInt(z8);
        if (i129 > 0) {
            W4 w4 = new W4(i129);
            for (int i130 = 0; i130 < i129; i130++) {
                float f108 = c5167z70.readFloat();
                C2735Rr c2735Rr = (C2735Rr) d70.f.get(c5167z70.readInt(z8));
                C2683Pr c2683Pr = new C2683Pr(f108, c2735Rr);
                c5167z70.readInt(false);
                c5167z70.readFloat();
                c5167z70.readString();
                if (c2735Rr.e != null) {
                    c5167z70.readFloat();
                    c5167z70.readFloat();
                }
                w4.b[i130] = f108;
                w4.c[i130] = c2683Pr;
            }
            array.add(w4);
        }
        Object[] objArr = array.items;
        int i131 = array.size;
        float fMax = 0.0f;
        for (int i132 = 0; i132 < i131; i132++) {
            AbstractC3405f5 abstractC3405f5 = (AbstractC3405f5) objArr[i132];
            float[] fArr7 = abstractC3405f5.b;
            fMax = Math.max(fMax, fArr7[fArr7.length - abstractC3405f5.c()]);
        }
        return new C3493g5(str, array, fMax);
    }

    public static void c(JsonValue jsonValue, String str, D70 d70) {
        String str2;
        D70 d71;
        float f;
        int[] iArr;
        O70 o70;
        float[] fArr;
        int iIndexOf;
        Z4 z4;
        float f2;
        int i;
        String str3;
        String str4;
        Array array;
        C3619hb c3619hb;
        String str5;
        O70 o71;
        String str6;
        JsonValue jsonValue2;
        String str7;
        String str8;
        String str9;
        Array array2;
        JsonValue jsonValue3;
        Array array3 = new Array();
        JsonValue child = jsonValue.getChild("slots");
        while (true) {
            String str10 = ")";
            String str11 = " (";
            String str12 = "Slot not found: ";
            String str13 = "name";
            String str14 = "time";
            if (child == null) {
                Array array4 = array3;
                String str15 = "name";
                String str16 = "time";
                for (JsonValue child2 = jsonValue.getChild("bones"); child2 != null; child2 = child2.next) {
                    C3619hb c3619hbB = d70.b(child2.name);
                    if (c3619hbB == null) {
                        throw new SerializationException("Bone not found: " + child2.name);
                    }
                    JsonValue jsonValue4 = child2.child;
                    while (jsonValue4 != null) {
                        JsonValue jsonValue5 = jsonValue4.child;
                        if (jsonValue5 == null) {
                            c3619hb = c3619hbB;
                            str5 = str16;
                            array = array4;
                        } else {
                            int i2 = jsonValue4.size;
                            String str17 = jsonValue4.name;
                            boolean zEquals = str17.equals("rotate");
                            int i3 = c3619hbB.f4458a;
                            if (zEquals) {
                                C3140c5 c3140c5 = new C3140c5(i2, i2, i3);
                                k(jsonValue5, c3140c5, 0.0f);
                                Array array5 = array4;
                                array5.add(c3140c5);
                                c3619hb = c3619hbB;
                                array = array5;
                            } else {
                                array = array4;
                                if (str17.equals("translate")) {
                                    c3619hb = c3619hbB;
                                    C3229d5 c3229d5 = new C3229d5(i2, i2 << 1, i3, 2);
                                    l(jsonValue5, c3229d5, 0.0f);
                                    array.add(c3229d5);
                                } else {
                                    c3619hb = c3619hbB;
                                    if (str17.equals("translatex")) {
                                        Q4 q4 = new Q4(i2, i2, i3, 7);
                                        k(jsonValue5, q4, 0.0f);
                                        array.add(q4);
                                    } else if (str17.equals("translatey")) {
                                        Q4 q5 = new Q4(i2, i2, i3, 8);
                                        k(jsonValue5, q5, 0.0f);
                                        array.add(q5);
                                    } else if (str17.equals("scale")) {
                                        C3229d5 c3229d6 = new C3229d5(i2, i2 << 1, i3, 0);
                                        l(jsonValue5, c3229d6, 1.0f);
                                        array.add(c3229d6);
                                    } else if (str17.equals("scalex")) {
                                        Q4 q6 = new Q4(i2, i2, i3, 3);
                                        k(jsonValue5, q6, 1.0f);
                                        array.add(q6);
                                    } else if (str17.equals("scaley")) {
                                        Q4 q7 = new Q4(i2, i2, i3, 4);
                                        k(jsonValue5, q7, 1.0f);
                                        array.add(q7);
                                    } else if (str17.equals("shear")) {
                                        C3229d5 c3229d7 = new C3229d5(i2, i2 << 1, i3, 1);
                                        l(jsonValue5, c3229d7, 0.0f);
                                        array.add(c3229d7);
                                    } else {
                                        float f3 = 0.0f;
                                        if (str17.equals("shearx")) {
                                            Q4 q8 = new Q4(i2, i2, i3, 5);
                                            k(jsonValue5, q8, 0.0f);
                                            array.add(q8);
                                        } else if (str17.equals("sheary")) {
                                            Q4 q9 = new Q4(i2, i2, i3, 6);
                                            k(jsonValue5, q9, 0.0f);
                                            array.add(q9);
                                        } else {
                                            if (!str17.equals("inherit")) {
                                                throw new RuntimeException(DM.m(AbstractC3950lJ.u("Invalid timeline type for a bone: ", str17, " ("), child2.name, ")"));
                                            }
                                            Y4 y4 = new Y4(i2, i3);
                                            int i4 = 0;
                                            while (jsonValue5 != null) {
                                                String str18 = str16;
                                                float f4 = jsonValue5.getFloat(str18, f3);
                                                EnumC3531gb enumC3531gb = EnumC3531gb.f4419a;
                                                EnumC3531gb enumC3531gbValueOf = EnumC3531gb.valueOf(jsonValue5.getString("inherit", "normal"));
                                                int i5 = i4 * 2;
                                                float[] fArr2 = y4.b;
                                                fArr2[i5] = f4;
                                                fArr2[i5 + 1] = enumC3531gbValueOf.ordinal();
                                                jsonValue5 = jsonValue5.next;
                                                i4++;
                                                str16 = str18;
                                                f3 = 0.0f;
                                            }
                                            str5 = str16;
                                            array.add(y4);
                                        }
                                    }
                                }
                            }
                            str5 = str16;
                        }
                        jsonValue4 = jsonValue4.next;
                        array4 = array;
                        str16 = str5;
                        c3619hbB = c3619hb;
                    }
                }
                D70 d72 = d70;
                String str19 = str16;
                Array array6 = array4;
                JsonValue child3 = jsonValue.getChild("ik");
                while (true) {
                    str2 = "mix";
                    if (child3 == null) {
                        break;
                    }
                    JsonValue jsonValue6 = child3.child;
                    if (jsonValue6 != null) {
                        C3505gC c3505gCD = d72.d(child3.name);
                        int i6 = child3.size;
                        boolean z = true;
                        X4 x4 = new X4(i6, i6 << 1, d72.h.indexOf(c3505gCD, true), 0);
                        float f5 = jsonValue6.getFloat(str19, 0.0f);
                        float f6 = jsonValue6.getFloat("mix", 1.0f);
                        float f7 = f5;
                        float f8 = jsonValue6.getFloat("softness", 0.0f) * 1.0f;
                        int i7 = 0;
                        int iE = 0;
                        while (true) {
                            x4.m(i7, f7, f6, f8, jsonValue6.getBoolean("bendPositive", z) ? 1 : -1, jsonValue6.getBoolean("compress", false), jsonValue6.getBoolean("stretch", false));
                            JsonValue jsonValue7 = jsonValue6.next;
                            if (jsonValue7 == null) {
                                break;
                            }
                            float f9 = jsonValue7.getFloat(str19, 0.0f);
                            JsonValue jsonValue8 = child3;
                            float f10 = jsonValue7.getFloat("mix", 1.0f);
                            float f11 = jsonValue7.getFloat("softness", 0.0f) * 1.0f;
                            JsonValue jsonValue9 = jsonValue6.get("curve");
                            if (jsonValue9 != null) {
                                int i8 = i7;
                                float f12 = f7;
                                iE = e(jsonValue9, x4, e(jsonValue9, x4, iE, i8, 0, f12, f9, f6, f10), i8, 1, f12, f9, f8, f11);
                            }
                            i7++;
                            jsonValue6 = jsonValue7;
                            f8 = f11;
                            f7 = f9;
                            child3 = jsonValue8;
                            f6 = f10;
                            z = true;
                        }
                        x4.i(iE);
                        array6.add(x4);
                    }
                    child3 = child3.next;
                    str12 = str12;
                }
                String str20 = str12;
                JsonValue child4 = jsonValue.getChild("transform");
                while (true) {
                    String str21 = "mixY";
                    String str22 = "mixRotate";
                    if (child4 == null) {
                        break;
                    }
                    JsonValue jsonValue10 = child4.child;
                    if (jsonValue10 != null) {
                        Ed0 ed0I = d72.i(child4.name);
                        int i9 = child4.size;
                        X4 x5 = new X4(i9, i9 * 6, d72.i.indexOf(ed0I, true), 6);
                        float f13 = jsonValue10.getFloat(str19, 0.0f);
                        float f14 = jsonValue10.getFloat("mixRotate", 1.0f);
                        float f15 = jsonValue10.getFloat("mixX", 1.0f);
                        float f16 = jsonValue10.getFloat("mixY", f15);
                        float f17 = jsonValue10.getFloat("mixScaleX", 1.0f);
                        float f18 = f16;
                        float f19 = f13;
                        float f20 = f14;
                        float f21 = jsonValue10.getFloat("mixScaleY", f17);
                        float f22 = f17;
                        float f23 = f15;
                        float f24 = jsonValue10.getFloat("mixShearY", 1.0f);
                        int i10 = 0;
                        int iE2 = 0;
                        while (true) {
                            x5.k(f19, f20, f23, f18, f22, f21, f24, i10);
                            JsonValue jsonValue11 = jsonValue10.next;
                            if (jsonValue11 == null) {
                                break;
                            }
                            JsonValue jsonValue12 = child4;
                            float f25 = jsonValue11.getFloat(str19, 0.0f);
                            float f26 = jsonValue11.getFloat(str22, 1.0f);
                            String str23 = str22;
                            float f27 = jsonValue11.getFloat("mixX", 1.0f);
                            float f28 = jsonValue11.getFloat(str21, f27);
                            String str24 = str21;
                            float f29 = jsonValue11.getFloat("mixScaleX", 1.0f);
                            float f30 = jsonValue11.getFloat("mixScaleY", f29);
                            float f31 = jsonValue11.getFloat("mixShearY", 1.0f);
                            JsonValue jsonValue13 = jsonValue10.get("curve");
                            if (jsonValue13 != null) {
                                int i11 = i10;
                                float f32 = f19;
                                iE2 = e(jsonValue13, x5, e(jsonValue13, x5, e(jsonValue13, x5, e(jsonValue13, x5, e(jsonValue13, x5, e(jsonValue13, x5, iE2, i11, 0, f32, f25, f20, f26), i11, 1, f32, f25, f23, f27), i11, 2, f32, f25, f18, f28), i11, 3, f32, f25, f22, f29), i11, 4, f32, f25, f21, f30), i11, 5, f32, f25, f24, f31);
                            }
                            i10++;
                            f22 = f29;
                            f23 = f27;
                            jsonValue10 = jsonValue11;
                            child4 = jsonValue12;
                            f19 = f25;
                            f20 = f26;
                            str22 = str23;
                            f18 = f28;
                            str21 = str24;
                            f21 = f30;
                            f24 = f31;
                        }
                        x5.i(iE2);
                        array6.add(x5);
                    }
                    child4 = child4.next;
                    d72 = d70;
                    str2 = str2;
                }
                String str25 = "mixY";
                String str26 = str2;
                String str27 = "mixRotate";
                for (JsonValue child5 = jsonValue.getChild(MBridgeConstans.DYNAMIC_VIEW_WX_PATH); child5 != null; child5 = child5.next) {
                    TT ttE = d70.e(child5.name);
                    if (ttE == null) {
                        throw new SerializationException("Path constraint not found: " + child5.name);
                    }
                    int iIndexOf2 = d70.j.indexOf(ttE, true);
                    JsonValue jsonValue14 = child5.child;
                    while (jsonValue14 != null) {
                        JsonValue jsonValue15 = jsonValue14.child;
                        if (jsonValue15 == null) {
                            i = iIndexOf2;
                            str3 = str26;
                            str4 = str25;
                            ttE = ttE;
                        } else {
                            int i12 = jsonValue14.size;
                            String str28 = jsonValue14.name;
                            if (str28.equals("position")) {
                                Q4 q10 = new Q4(i12, i12, iIndexOf2, 1);
                                QT qt = QT.f3603a;
                                k(jsonValue15, q10, 0.0f);
                                array6.add(q10);
                            } else if (str28.equals("spacing")) {
                                Q4 q11 = new Q4(i12, i12, iIndexOf2, 2);
                                if (ttE.g != ST.f3715a) {
                                    ST st = ST.b;
                                }
                                k(jsonValue15, q11, 0.0f);
                                array6.add(q11);
                            } else {
                                String str29 = str26;
                                if (str28.equals(str29)) {
                                    X4 x6 = new X4(i12, i12 * 3, iIndexOf2, 1);
                                    float f33 = jsonValue15.getFloat(str19, 0.0f);
                                    String str30 = str27;
                                    float f34 = jsonValue15.getFloat(str30, 1.0f);
                                    float f35 = jsonValue15.getFloat("mixX", 1.0f);
                                    str4 = str25;
                                    float f36 = f35;
                                    float f37 = f34;
                                    float f38 = f33;
                                    float f39 = jsonValue15.getFloat(str4, f35);
                                    int i13 = 0;
                                    int iE3 = 0;
                                    while (true) {
                                        x6.l(i13, f38, f37, f36, f39);
                                        i = iIndexOf2;
                                        JsonValue jsonValue16 = jsonValue15.next;
                                        if (jsonValue16 == null) {
                                            break;
                                        }
                                        String str31 = str29;
                                        float f40 = jsonValue16.getFloat(str19, 0.0f);
                                        float f41 = jsonValue16.getFloat(str30, 1.0f);
                                        String str32 = str30;
                                        float f42 = jsonValue16.getFloat("mixX", 1.0f);
                                        float f43 = jsonValue16.getFloat(str4, f42);
                                        JsonValue jsonValue17 = jsonValue15.get("curve");
                                        if (jsonValue17 != null) {
                                            int i14 = i13;
                                            float f44 = f38;
                                            iE3 = e(jsonValue17, x6, e(jsonValue17, x6, e(jsonValue17, x6, iE3, i14, 0, f44, f40, f37, f41), i14, 1, f44, f40, f36, f42), i14, 2, f44, f40, f39, f43);
                                        }
                                        i13++;
                                        jsonValue15 = jsonValue16;
                                        f36 = f42;
                                        f37 = f41;
                                        iIndexOf2 = i;
                                        str29 = str31;
                                        f38 = f40;
                                        f39 = f43;
                                        str30 = str32;
                                    }
                                    x6.i(iE3);
                                    array6.add(x6);
                                    str27 = str30;
                                    str3 = str29;
                                } else {
                                    i = iIndexOf2;
                                    str3 = str29;
                                    str4 = str25;
                                }
                            }
                            i = iIndexOf2;
                            str3 = str26;
                            str4 = str25;
                            ttE = ttE;
                        }
                        jsonValue14 = jsonValue14.next;
                        str25 = str4;
                        ttE = ttE;
                        iIndexOf2 = i;
                        str26 = str3;
                    }
                }
                D70 d73 = d70;
                String str33 = str26;
                for (JsonValue child6 = jsonValue.getChild("physics"); child6 != null; child6 = child6.next) {
                    if (child6.name.isEmpty()) {
                        iIndexOf = -1;
                    } else {
                        C4137nU c4137nUF = d73.f(child6.name);
                        if (c4137nUF == null) {
                            throw new SerializationException("Physics constraint not found: " + child6.name);
                        }
                        iIndexOf = d73.k.indexOf(c4137nUF, true);
                    }
                    JsonValue jsonValue18 = child6.child;
                    while (jsonValue18 != null) {
                        JsonValue jsonValue19 = jsonValue18.child;
                        if (jsonValue19 == null) {
                            str33 = str33;
                        } else {
                            int i15 = jsonValue18.size;
                            String str34 = jsonValue18.name;
                            if (str34.equals("reset")) {
                                C2963a5 c2963a5 = new C2963a5(i15, iIndexOf);
                                int i16 = 0;
                                while (jsonValue19 != null) {
                                    c2963a5.b[i16] = jsonValue19.getFloat(str19, 0.0f);
                                    jsonValue19 = jsonValue19.next;
                                    i16++;
                                }
                                array6.add(c2963a5);
                                str33 = str33;
                            } else {
                                if (str34.equals("inertia")) {
                                    z4 = new Z4(i15, i15, iIndexOf, 2);
                                    f2 = 0.0f;
                                } else {
                                    if (str34.equals("strength")) {
                                        z4 = new Z4(i15, i15, iIndexOf, 5);
                                    } else if (str34.equals("damping")) {
                                        z4 = new Z4(i15, i15, iIndexOf, 0);
                                    } else if (str34.equals("mass")) {
                                        z4 = new Z4(i15, i15, iIndexOf, 3);
                                    } else {
                                        if (str34.equals("wind")) {
                                            z4 = new Z4(i15, i15, iIndexOf, 6);
                                        } else if (str34.equals("gravity")) {
                                            z4 = new Z4(i15, i15, iIndexOf, 1);
                                        } else {
                                            str33 = str33;
                                            if (str34.equals(str33)) {
                                                z4 = new Z4(i15, i15, iIndexOf, 4);
                                                f2 = 0.0f;
                                                k(jsonValue19, z4, f2);
                                                array6.add(z4);
                                            }
                                        }
                                        str33 = str33;
                                        f2 = 0.0f;
                                        k(jsonValue19, z4, f2);
                                        array6.add(z4);
                                    }
                                    f2 = 0.0f;
                                }
                                k(jsonValue19, z4, f2);
                                array6.add(z4);
                            }
                        }
                        jsonValue18 = jsonValue18.next;
                        str33 = str33;
                    }
                }
                JsonValue child7 = jsonValue.getChild("attachments");
                while (child7 != null) {
                    I70 i70G = d73.g(child7.name);
                    if (i70G == null) {
                        throw new SerializationException("Skin not found: " + child7.name);
                    }
                    JsonValue jsonValue20 = child7.child;
                    while (jsonValue20 != null) {
                        O70 o70H = d73.h(jsonValue20.name);
                        if (o70H == null) {
                            throw new SerializationException(str20 + jsonValue20.name);
                        }
                        JsonValue jsonValue21 = jsonValue20.child;
                        while (jsonValue21 != null) {
                            String str35 = jsonValue21.name;
                            int i17 = o70H.f3494a;
                            AbstractC3413f9 abstractC3413f9A = i70G.a(i17, str35);
                            if (abstractC3413f9A == null) {
                                throw new SerializationException("Timeline attachment not found: " + jsonValue21.name);
                            }
                            JsonValue jsonValue22 = jsonValue21.child;
                            while (jsonValue22 != null) {
                                JsonValue jsonValue23 = jsonValue22.child;
                                int i18 = jsonValue22.size;
                                String str36 = jsonValue22.name;
                                I70 i70 = i70G;
                                if (str36.equals("deform")) {
                                    AbstractC3806jh0 abstractC3806jh0 = (AbstractC3806jh0) abstractC3413f9A;
                                    boolean z2 = abstractC3806jh0.e != null;
                                    float[] fArr3 = abstractC3806jh0.f;
                                    o70 = o70H;
                                    int length = z2 ? (fArr3.length / 3) << 1 : fArr3.length;
                                    U4 u4 = new U4(i18, i18, i17, abstractC3806jh0);
                                    float f45 = jsonValue23.getFloat(str19, 0.0f);
                                    int i19 = 0;
                                    int iE4 = 0;
                                    while (true) {
                                        JsonValue jsonValue24 = jsonValue23.get("vertices");
                                        if (jsonValue24 == null) {
                                            fArr = z2 ? new float[length] : fArr3;
                                        } else {
                                            float[] fArr4 = new float[length];
                                            AbstractC2340Cl.i(jsonValue23.getInt(TypedValues.CycleType.S_WAVE_OFFSET, 0), jsonValue24.size, jsonValue24.asFloatArray(), fArr4);
                                            if (!z2) {
                                                for (int i20 = 0; i20 < length; i20++) {
                                                    fArr4[i20] = fArr4[i20] + fArr3[i20];
                                                }
                                            }
                                            fArr = fArr4;
                                        }
                                        u4.b[i19] = f45;
                                        u4.f[i19] = fArr;
                                        JsonValue jsonValue25 = jsonValue23.next;
                                        if (jsonValue25 == null) {
                                            break;
                                        }
                                        float f46 = jsonValue25.getFloat(str19, 0.0f);
                                        JsonValue jsonValue26 = jsonValue23.get("curve");
                                        if (jsonValue26 != null) {
                                            iE4 = e(jsonValue26, u4, iE4, i19, 0, f45, f46, 0.0f, 1.0f);
                                        }
                                        i19++;
                                        jsonValue23 = jsonValue25;
                                        f45 = f46;
                                        child7 = child7;
                                        jsonValue20 = jsonValue20;
                                        jsonValue21 = jsonValue21;
                                    }
                                    u4.i(iE4);
                                    array6.add(u4);
                                } else {
                                    child7 = child7;
                                    jsonValue20 = jsonValue20;
                                    o70 = o70H;
                                    jsonValue21 = jsonValue21;
                                    if (str36.equals("sequence")) {
                                        C3317e5 c3317e5 = new C3317e5(i18, i17, abstractC3413f9A);
                                        int i21 = 0;
                                        float f47 = 0.0f;
                                        while (jsonValue23 != null) {
                                            f47 = jsonValue23.getFloat("delay", f47);
                                            float f48 = jsonValue23.getFloat(str19, 0.0f);
                                            EnumC4457r40 enumC4457r40ValueOf = EnumC4457r40.valueOf(jsonValue23.getString("mode", "hold"));
                                            int i22 = jsonValue23.getInt("index", 0);
                                            int i23 = i21 * 3;
                                            float[] fArr5 = c3317e5.b;
                                            fArr5[i23] = f48;
                                            fArr5[i23 + 1] = enumC4457r40ValueOf.ordinal() | (i22 << 4);
                                            fArr5[i23 + 2] = f47;
                                            jsonValue23 = jsonValue23.next;
                                            i21++;
                                        }
                                        array6.add(c3317e5);
                                    }
                                    jsonValue22 = jsonValue22.next;
                                    i70G = i70;
                                    o70H = o70;
                                    child7 = child7;
                                    jsonValue20 = jsonValue20;
                                    jsonValue21 = jsonValue21;
                                }
                                jsonValue22 = jsonValue22.next;
                                i70G = i70;
                                o70H = o70;
                                child7 = child7;
                                jsonValue20 = jsonValue20;
                                jsonValue21 = jsonValue21;
                            }
                            jsonValue21 = jsonValue21.next;
                            child7 = child7;
                        }
                        jsonValue20 = jsonValue20.next;
                        d73 = d70;
                    }
                    child7 = child7.next;
                    d73 = d70;
                }
                JsonValue jsonValue27 = jsonValue.get("drawOrder");
                if (jsonValue27 != null) {
                    V4 v4 = new V4(jsonValue27.size);
                    d71 = d70;
                    int i24 = d71.c.size;
                    JsonValue jsonValue28 = jsonValue27.child;
                    int i25 = 0;
                    while (jsonValue28 != null) {
                        JsonValue jsonValue29 = jsonValue28.get("offsets");
                        if (jsonValue29 != null) {
                            iArr = new int[i24];
                            int i26 = i24 - 1;
                            for (int i27 = i26; i27 >= 0; i27--) {
                                iArr[i27] = -1;
                            }
                            int[] iArr2 = new int[i24 - jsonValue29.size];
                            JsonValue jsonValue30 = jsonValue29.child;
                            int i28 = 0;
                            int i29 = 0;
                            while (jsonValue30 != null) {
                                O70 o70H2 = d71.h(jsonValue30.getString("slot"));
                                if (o70H2 == null) {
                                    throw new SerializationException(str20 + jsonValue30.getString("slot"));
                                }
                                int i30 = i26;
                                while (i28 != o70H2.f3494a) {
                                    iArr2[i29] = i28;
                                    i29++;
                                    i28++;
                                }
                                iArr[jsonValue30.getInt(TypedValues.CycleType.S_WAVE_OFFSET) + i28] = i28;
                                jsonValue30 = jsonValue30.next;
                                i28++;
                                i26 = i30;
                            }
                            int i31 = i26;
                            while (i28 < i24) {
                                iArr2[i29] = i28;
                                i29++;
                                i28++;
                            }
                            for (int i32 = i31; i32 >= 0; i32--) {
                                if (iArr[i32] == -1) {
                                    i29--;
                                    iArr[i32] = iArr2[i29];
                                }
                            }
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            iArr = null;
                        }
                        v4.b[i25] = jsonValue28.getFloat(str19, f);
                        v4.c[i25] = iArr;
                        jsonValue28 = jsonValue28.next;
                        i25++;
                    }
                    array6.add(v4);
                } else {
                    d71 = d70;
                }
                JsonValue jsonValue31 = jsonValue.get(com.umeng.analytics.pro.f.ax);
                if (jsonValue31 != null) {
                    W4 w4 = new W4(jsonValue31.size);
                    JsonValue jsonValue32 = jsonValue31.child;
                    int i33 = 0;
                    while (jsonValue32 != null) {
                        String str37 = str15;
                        C2735Rr c2735RrC = d71.c(jsonValue32.getString(str37));
                        if (c2735RrC == null) {
                            throw new SerializationException("Event not found: " + jsonValue32.getString(str37));
                        }
                        float f49 = jsonValue32.getFloat(str19, 0.0f);
                        C2683Pr c2683Pr = new C2683Pr(f49, c2735RrC);
                        jsonValue32.getInt("int", c2735RrC.b);
                        jsonValue32.getFloat(TypedValues.Custom.S_FLOAT, c2735RrC.c);
                        jsonValue32.getString(TypedValues.Custom.S_STRING, c2735RrC.d);
                        if (c2735RrC.e != null) {
                            jsonValue32.getFloat("volume", c2735RrC.f);
                            jsonValue32.getFloat("balance", c2735RrC.g);
                        }
                        w4.b[i33] = f49;
                        w4.c[i33] = c2683Pr;
                        jsonValue32 = jsonValue32.next;
                        i33++;
                        str15 = str37;
                    }
                    array6.add(w4);
                }
                array6.shrink();
                Object[] objArr = array6.items;
                int i34 = array6.size;
                float fMax = 0.0f;
                for (int i35 = 0; i35 < i34; i35++) {
                    AbstractC3405f5 abstractC3405f5 = (AbstractC3405f5) objArr[i35];
                    float[] fArr6 = abstractC3405f5.b;
                    fMax = Math.max(fMax, fArr6[fArr6.length - abstractC3405f5.c()]);
                }
                d71.g.add(new C3493g5(str, array6, fMax));
                return;
            }
            O70 o70H3 = d70.h(child.name);
            if (o70H3 == null) {
                throw new SerializationException("Slot not found: " + child.name);
            }
            JsonValue jsonValue33 = child.child;
            while (jsonValue33 != null) {
                JsonValue jsonValue34 = jsonValue33.child;
                if (jsonValue34 == null) {
                    array2 = array3;
                    jsonValue2 = child;
                    str7 = str10;
                    str8 = str11;
                    jsonValue3 = jsonValue33;
                    str6 = str13;
                    o71 = o70H3;
                    str9 = str14;
                } else {
                    int i36 = jsonValue33.size;
                    String str38 = jsonValue33.name;
                    boolean zEquals2 = str38.equals("attachment");
                    int i37 = o70H3.f3494a;
                    if (zEquals2) {
                        R4 r4 = new R4(i36, i37);
                        int i38 = 0;
                        while (jsonValue34 != null) {
                            float f50 = jsonValue34.getFloat(str14, 0.0f);
                            String string = jsonValue34.getString(str13, null);
                            r4.b[i38] = f50;
                            r4.d[i38] = string;
                            jsonValue34 = jsonValue34.next;
                            i38++;
                        }
                        array3.add(r4);
                        array2 = array3;
                        jsonValue2 = child;
                        str7 = str10;
                        str8 = str11;
                        jsonValue3 = jsonValue33;
                        str6 = str13;
                        o71 = o70H3;
                        str9 = str14;
                    } else {
                        o71 = o70H3;
                        String str39 = "color";
                        str6 = str13;
                        if (str38.equals("rgba")) {
                            X4 x7 = new X4(i36, i36 << 2, i37, 4);
                            float f51 = jsonValue34.getFloat(str14, 0.0f);
                            String string2 = jsonValue34.getString("color");
                            float f52 = Integer.parseInt(string2.substring(0, 2), 16) / 255.0f;
                            float f53 = Integer.parseInt(string2.substring(2, 4), 16) / 255.0f;
                            float f54 = Integer.parseInt(string2.substring(4, 6), 16) / 255.0f;
                            float f55 = Integer.parseInt(string2.substring(6, 8), 16) / 255.0f;
                            float f56 = f51;
                            float f57 = f52;
                            float f58 = f53;
                            int i39 = 0;
                            int iE5 = 0;
                            while (true) {
                                int i40 = i39 * 5;
                                float[] fArr7 = x7.b;
                                fArr7[i40] = f56;
                                fArr7[i40 + 1] = f57;
                                fArr7[i40 + 2] = f58;
                                fArr7[i40 + 3] = f54;
                                fArr7[i40 + 4] = f55;
                                JsonValue jsonValue35 = jsonValue34.next;
                                if (jsonValue35 == null) {
                                    break;
                                }
                                String str40 = str10;
                                float f59 = jsonValue35.getFloat(str14, 0.0f);
                                String string3 = jsonValue35.getString(str39);
                                JsonValue jsonValue36 = child;
                                String str41 = str11;
                                float f60 = Integer.parseInt(string3.substring(0, 2), 16) / 255.0f;
                                Array array7 = array3;
                                JsonValue jsonValue37 = jsonValue33;
                                float f61 = Integer.parseInt(string3.substring(2, 4), 16) / 255.0f;
                                String str42 = str39;
                                float f62 = Integer.parseInt(string3.substring(4, 6), 16) / 255.0f;
                                float f63 = Integer.parseInt(string3.substring(6, 8), 16) / 255.0f;
                                JsonValue jsonValue38 = jsonValue34.get("curve");
                                if (jsonValue38 != null) {
                                    int i41 = i39;
                                    float f64 = f56;
                                    iE5 = e(jsonValue38, x7, e(jsonValue38, x7, e(jsonValue38, x7, e(jsonValue38, x7, iE5, i41, 0, f64, f59, f57, f60), i41, 1, f64, f59, f58, f61), i41, 2, f64, f59, f54, f62), i41, 3, f64, f59, f55, f63);
                                }
                                i39++;
                                f58 = f61;
                                f55 = f63;
                                f57 = f60;
                                f54 = f62;
                                str10 = str40;
                                f56 = f59;
                                jsonValue34 = jsonValue35;
                                child = jsonValue36;
                                str11 = str41;
                                jsonValue33 = jsonValue37;
                                array3 = array7;
                                str39 = str42;
                            }
                            x7.i(iE5);
                            array3.add(x7);
                            array2 = array3;
                            jsonValue2 = child;
                            str7 = str10;
                            str8 = str11;
                            jsonValue3 = jsonValue33;
                            str9 = str14;
                        } else {
                            Array array8 = array3;
                            jsonValue2 = child;
                            str7 = str10;
                            str8 = str11;
                            JsonValue jsonValue39 = jsonValue33;
                            if (str38.equals("rgb")) {
                                X4 x8 = new X4(i36, i36 * 3, i37, 5);
                                float f65 = jsonValue34.getFloat(str14, 0.0f);
                                String str43 = "color";
                                String string4 = jsonValue34.getString(str43);
                                float f66 = Integer.parseInt(string4.substring(0, 2), 16) / 255.0f;
                                float f67 = Integer.parseInt(string4.substring(2, 4), 16) / 255.0f;
                                float f68 = Integer.parseInt(string4.substring(4, 6), 16) / 255.0f;
                                float f69 = f65;
                                float f70 = f67;
                                float f71 = f66;
                                int i42 = 0;
                                int iE6 = 0;
                                while (true) {
                                    x8.l(i42, f69, f71, f70, f68);
                                    JsonValue jsonValue40 = jsonValue34.next;
                                    if (jsonValue40 == null) {
                                        break;
                                    }
                                    Array array9 = array8;
                                    float f72 = jsonValue40.getFloat(str14, 0.0f);
                                    String string5 = jsonValue40.getString(str43);
                                    float f73 = Integer.parseInt(string5.substring(0, 2), 16) / 255.0f;
                                    String str44 = str43;
                                    String str45 = str14;
                                    float f74 = Integer.parseInt(string5.substring(2, 4), 16) / 255.0f;
                                    float f75 = Integer.parseInt(string5.substring(4, 6), 16) / 255.0f;
                                    JsonValue jsonValue41 = jsonValue34.get("curve");
                                    if (jsonValue41 != null) {
                                        int i43 = i42;
                                        float f76 = f69;
                                        iE6 = e(jsonValue41, x8, e(jsonValue41, x8, e(jsonValue41, x8, iE6, i43, 0, f76, f72, f71, f73), i43, 1, f76, f72, f70, f74), i43, 2, f76, f72, f68, f75);
                                    }
                                    i42++;
                                    f71 = f73;
                                    array8 = array9;
                                    f68 = f75;
                                    f69 = f72;
                                    f70 = f74;
                                    jsonValue34 = jsonValue40;
                                    str14 = str45;
                                    str43 = str44;
                                }
                                x8.i(iE6);
                                Array array10 = array8;
                                array10.add(x8);
                                array2 = array10;
                                str9 = str14;
                            } else {
                                String str46 = str14;
                                Array array11 = array8;
                                if (str38.equals("alpha")) {
                                    Q4 q12 = new Q4(i36, i36, i37, 0);
                                    k(jsonValue34, q12, 0.0f);
                                    array11.add(q12);
                                    array2 = array11;
                                    str9 = str46;
                                } else {
                                    String str47 = "dark";
                                    String str48 = "light";
                                    if (str38.equals("rgba2")) {
                                        X4 x9 = new X4(i36, i36 * 7, i37, 3);
                                        String str49 = str46;
                                        float f77 = jsonValue34.getFloat(str49, 0.0f);
                                        String string6 = jsonValue34.getString("light");
                                        float f78 = Integer.parseInt(string6.substring(0, 2), 16) / 255.0f;
                                        float f79 = Integer.parseInt(string6.substring(2, 4), 16) / 255.0f;
                                        float f80 = Integer.parseInt(string6.substring(4, 6), 16) / 255.0f;
                                        float f81 = Integer.parseInt(string6.substring(6, 8), 16) / 255.0f;
                                        String string7 = jsonValue34.getString("dark");
                                        float f82 = Integer.parseInt(string7.substring(0, 2), 16) / 255.0f;
                                        float f83 = Integer.parseInt(string7.substring(2, 4), 16) / 255.0f;
                                        float f84 = Integer.parseInt(string7.substring(4, 6), 16) / 255.0f;
                                        float f85 = f78;
                                        float f86 = f81;
                                        float f87 = f82;
                                        int i44 = 0;
                                        float f88 = f79;
                                        float f89 = f77;
                                        int iE7 = 0;
                                        while (true) {
                                            x9.j(f89, f85, f88, f80, f86, f87, f83, f84, i44);
                                            float f90 = f84;
                                            JsonValue jsonValue42 = jsonValue34.next;
                                            if (jsonValue42 == null) {
                                                break;
                                            }
                                            Array array12 = array11;
                                            float f91 = jsonValue42.getFloat(str49, 0.0f);
                                            String string8 = jsonValue42.getString(str48);
                                            String str50 = str48;
                                            String str51 = str49;
                                            float f92 = f83;
                                            float f93 = Integer.parseInt(string8.substring(0, 2), 16) / 255.0f;
                                            float f94 = f86;
                                            float f95 = f87;
                                            float f96 = Integer.parseInt(string8.substring(2, 4), 16) / 255.0f;
                                            float f97 = f80;
                                            f80 = Integer.parseInt(string8.substring(4, 6), 16) / 255.0f;
                                            float f98 = Integer.parseInt(string8.substring(6, 8), 16) / 255.0f;
                                            String string9 = jsonValue42.getString(str47);
                                            String str52 = str47;
                                            float f99 = Integer.parseInt(string9.substring(0, 2), 16) / 255.0f;
                                            float f100 = Integer.parseInt(string9.substring(2, 4), 16) / 255.0f;
                                            float f101 = Integer.parseInt(string9.substring(4, 6), 16) / 255.0f;
                                            JsonValue jsonValue43 = jsonValue34.get("curve");
                                            if (jsonValue43 != null) {
                                                int i45 = i44;
                                                float f102 = f89;
                                                iE7 = e(jsonValue43, x9, e(jsonValue43, x9, e(jsonValue43, x9, e(jsonValue43, x9, e(jsonValue43, x9, e(jsonValue43, x9, e(jsonValue43, x9, iE7, i45, 0, f102, f91, f85, f93), i45, 1, f102, f91, f88, f96), i45, 2, f102, f91, f97, f80), i45, 3, f102, f91, f94, f98), i45, 4, f102, f91, f95, f99), i45, 5, f102, f91, f92, f100), i45, 6, f102, f91, f90, f101);
                                            }
                                            i44++;
                                            f86 = f98;
                                            f88 = f96;
                                            f84 = f101;
                                            f85 = f93;
                                            f89 = f91;
                                            str48 = str50;
                                            array11 = array12;
                                            str49 = str51;
                                            jsonValue34 = jsonValue42;
                                            f87 = f99;
                                            f83 = f100;
                                            str47 = str52;
                                        }
                                        x9.i(iE7);
                                        array11.add(x9);
                                        array2 = array11;
                                        str9 = str49;
                                    } else {
                                        Array array13 = array11;
                                        if (!str38.equals("rgb2")) {
                                            throw new RuntimeException(DM.m(AbstractC3950lJ.u("Invalid timeline type for a slot: ", str38, str8), jsonValue2.name, str7));
                                        }
                                        X4 x10 = new X4(i36, i36 * 6, i37, 2);
                                        str9 = str46;
                                        float f103 = jsonValue34.getFloat(str9, 0.0f);
                                        String str53 = "light";
                                        String string10 = jsonValue34.getString(str53);
                                        float f104 = Integer.parseInt(string10.substring(0, 2), 16) / 255.0f;
                                        float f105 = Integer.parseInt(string10.substring(2, 4), 16) / 255.0f;
                                        float f106 = Integer.parseInt(string10.substring(4, 6), 16) / 255.0f;
                                        String str54 = "dark";
                                        String string11 = jsonValue34.getString(str54);
                                        float f107 = Integer.parseInt(string11.substring(0, 2), 16) / 255.0f;
                                        float f108 = Integer.parseInt(string11.substring(2, 4), 16) / 255.0f;
                                        float f109 = Integer.parseInt(string11.substring(4, 6), 16) / 255.0f;
                                        int i46 = 0;
                                        float f110 = f106;
                                        float f111 = f103;
                                        int iE8 = 0;
                                        while (true) {
                                            x10.k(f111, f104, f105, f110, f107, f108, f109, i46);
                                            JsonValue jsonValue44 = jsonValue34.next;
                                            if (jsonValue44 == null) {
                                                break;
                                            }
                                            float f112 = f109;
                                            JsonValue jsonValue45 = jsonValue39;
                                            Array array14 = array13;
                                            float f113 = jsonValue44.getFloat(str9, 0.0f);
                                            String string12 = jsonValue44.getString(str53);
                                            String str55 = str53;
                                            String str56 = str9;
                                            float f114 = f108;
                                            float f115 = Integer.parseInt(string12.substring(0, 2), 16) / 255.0f;
                                            float f116 = f110;
                                            float f117 = f107;
                                            float f118 = Integer.parseInt(string12.substring(2, 4), 16) / 255.0f;
                                            float f119 = Integer.parseInt(string12.substring(4, 6), 16) / 255.0f;
                                            String string13 = jsonValue44.getString(str54);
                                            String str57 = str54;
                                            float f120 = Integer.parseInt(string13.substring(0, 2), 16) / 255.0f;
                                            float f121 = Integer.parseInt(string13.substring(2, 4), 16) / 255.0f;
                                            f109 = Integer.parseInt(string13.substring(4, 6), 16) / 255.0f;
                                            JsonValue jsonValue46 = jsonValue34.get("curve");
                                            if (jsonValue46 != null) {
                                                int i47 = i46;
                                                float f122 = f111;
                                                iE8 = e(jsonValue46, x10, e(jsonValue46, x10, e(jsonValue46, x10, e(jsonValue46, x10, e(jsonValue46, x10, e(jsonValue46, x10, iE8, i47, 0, f122, f113, f104, f115), i47, 1, f122, f113, f105, f118), i47, 2, f122, f113, f116, f119), i47, 3, f122, f113, f117, f120), i47, 4, f122, f113, f114, f121), i47, 5, f122, f113, f112, f109);
                                            }
                                            i46++;
                                            f105 = f118;
                                            f104 = f115;
                                            f108 = f121;
                                            f111 = f113;
                                            str9 = str56;
                                            jsonValue34 = jsonValue44;
                                            f107 = f120;
                                            str54 = str57;
                                            array13 = array14;
                                            f110 = f119;
                                            str53 = str55;
                                            jsonValue39 = jsonValue45;
                                        }
                                        x10.i(iE8);
                                        array2 = array13;
                                        array2.add(x10);
                                    }
                                }
                            }
                            jsonValue3 = jsonValue39;
                        }
                    }
                }
                jsonValue33 = jsonValue3.next;
                array3 = array2;
                str14 = str9;
                o70H3 = o71;
                str13 = str6;
                str10 = str7;
                child = jsonValue2;
                str11 = str8;
            }
            child = child.next;
        }
    }

    public static int e(JsonValue jsonValue, T4 t4, int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (jsonValue.isString()) {
            if (jsonValue.asString().equals("stepped")) {
                t4.h(i2);
            }
            return i;
        }
        JsonValue jsonValue2 = jsonValue.get(i3 << 2);
        float fAsFloat = jsonValue2.asFloat();
        JsonValue jsonValue3 = jsonValue2.next;
        float fAsFloat2 = jsonValue3.asFloat() * 1.0f;
        JsonValue jsonValue4 = jsonValue3.next;
        t4.g(i, i2, i3, f, f3, fAsFloat, fAsFloat2, jsonValue4.asFloat(), jsonValue4.next.asFloat() * 1.0f, f2, f4);
        return i + 1;
    }

    public static float[] f(C5167z70 c5167z70, int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = c5167z70.readFloat();
        }
        return fArr;
    }

    public static C4633t40 g(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        C4633t40 c4633t40 = new C4633t40(jsonValue.getInt("count"));
        c4633t40.b = jsonValue.getInt("start", 1);
        c4633t40.c = jsonValue.getInt("digits", 0);
        c4633t40.d = jsonValue.getInt("setup", 0);
        return c4633t40;
    }

    public static C4633t40 h(C5167z70 c5167z70) {
        C4633t40 c4633t40 = new C4633t40(c5167z70.readInt(true));
        c4633t40.b = c5167z70.readInt(true);
        c4633t40.c = c5167z70.readInt(true);
        c4633t40.d = c5167z70.readInt(true);
        return c4633t40;
    }

    public static void k(JsonValue jsonValue, S4 s4, float f) {
        JsonValue jsonValue2 = jsonValue;
        float f2 = jsonValue2.getFloat("time", 0.0f);
        float f3 = jsonValue2.getFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f) * 1.0f;
        int iE = 0;
        int i = 0;
        while (true) {
            int i2 = i << 1;
            float[] fArr = s4.b;
            fArr[i2] = f2;
            fArr[i2 + 1] = f3;
            JsonValue jsonValue3 = jsonValue2.next;
            if (jsonValue3 == null) {
                s4.i(iE);
                return;
            }
            float f4 = jsonValue3.getFloat("time", 0.0f);
            float f5 = jsonValue3.getFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f) * 1.0f;
            JsonValue jsonValue4 = jsonValue2.get("curve");
            if (jsonValue4 != null) {
                iE = e(jsonValue4, s4, iE, i, 0, f2, f4, f3, f5);
            }
            i++;
            f2 = f4;
            f3 = f5;
            jsonValue2 = jsonValue3;
        }
    }

    public static void l(JsonValue jsonValue, C3229d5 c3229d5, float f) {
        JsonValue jsonValue2 = jsonValue;
        float f2 = jsonValue2.getFloat("time", 0.0f);
        float f3 = f2;
        float f4 = jsonValue2.getFloat("x", f) * 1.0f;
        float f5 = jsonValue2.getFloat("y", f) * 1.0f;
        int iE = 0;
        int i = 0;
        while (true) {
            int i2 = i * 3;
            float[] fArr = c3229d5.b;
            fArr[i2] = f3;
            fArr[i2 + 1] = f4;
            fArr[i2 + 2] = f5;
            JsonValue jsonValue3 = jsonValue2.next;
            if (jsonValue3 == null) {
                c3229d5.i(iE);
                return;
            }
            float f6 = jsonValue3.getFloat("time", 0.0f);
            float f7 = jsonValue3.getFloat("x", f) * 1.0f;
            float f8 = jsonValue3.getFloat("y", f) * 1.0f;
            JsonValue jsonValue4 = jsonValue2.get("curve");
            if (jsonValue4 != null) {
                int i3 = i;
                float f9 = f3;
                iE = e(jsonValue4, c3229d5, e(jsonValue4, c3229d5, iE, i3, 0, f9, f6, f4, f7), i3, 1, f9, f6, f5, f8);
            }
            i++;
            f3 = f6;
            f4 = f7;
            f5 = f8;
            jsonValue2 = jsonValue3;
        }
    }

    public static void m(C5167z70 c5167z70, Array array, S4 s4) throws IOException {
        float f = c5167z70.readFloat();
        float f2 = c5167z70.readFloat() * 1.0f;
        int iB = s4.b() - 1;
        int i = 0;
        float f3 = f;
        float f4 = f2;
        int i2 = 0;
        while (true) {
            int i3 = i2 << 1;
            float[] fArr = s4.b;
            fArr[i3] = f3;
            fArr[i3 + 1] = f4;
            if (i2 == iB) {
                array.add(s4);
                return;
            }
            float f5 = c5167z70.readFloat();
            float f6 = c5167z70.readFloat() * 1.0f;
            byte b = c5167z70.readByte();
            if (b == 1) {
                s4.h(i2);
            } else if (b == 2) {
                q(c5167z70, s4, i, i2, 0, f3, f5, f4, f6);
                i++;
            }
            i2++;
            f3 = f5;
            f4 = f6;
        }
    }

    public static void n(C5167z70 c5167z70, Array array, C3229d5 c3229d5) throws IOException {
        float f = c5167z70.readFloat();
        float f2 = c5167z70.readFloat() * 1.0f;
        float f3 = c5167z70.readFloat() * 1.0f;
        int iB = c3229d5.b() - 1;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i * 3;
            float[] fArr = c3229d5.b;
            fArr[i3] = f4;
            fArr[i3 + 1] = f5;
            fArr[i3 + 2] = f6;
            if (i == iB) {
                array.add(c3229d5);
                return;
            }
            float f7 = c5167z70.readFloat();
            float f8 = c5167z70.readFloat() * 1.0f;
            float f9 = c5167z70.readFloat() * 1.0f;
            byte b = c5167z70.readByte();
            if (b == 1) {
                c3229d5.h(i);
            } else if (b == 2) {
                int i4 = i2 + 1;
                int i5 = i;
                float f10 = f4;
                q(c5167z70, c3229d5, i2, i5, 0, f10, f7, f5, f8);
                i2 += 2;
                q(c5167z70, c3229d5, i4, i5, 1, f10, f7, f6, f9);
            }
            i++;
            f4 = f7;
            f5 = f8;
            f6 = f9;
        }
    }

    public static A70 o(C5167z70 c5167z70, boolean z) throws IOException {
        int i = c5167z70.readInt(true);
        A70 a70 = new A70(0);
        int i2 = i << 1;
        a70.b = i2;
        if (!z) {
            a70.d = f(c5167z70, i2);
            return a70;
        }
        FloatArray floatArray = new FloatArray(i2 * 9);
        IntArray intArray = new IntArray(a70.b * 3);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = c5167z70.readInt(true);
            intArray.add(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                intArray.add(c5167z70.readInt(true));
                floatArray.add(c5167z70.readFloat() * 1.0f);
                floatArray.add(c5167z70.readFloat() * 1.0f);
                floatArray.add(c5167z70.readFloat());
            }
        }
        a70.d = floatArray.toArray();
        a70.c = intArray.toArray();
        return a70;
    }

    public static void p(JsonValue jsonValue, AbstractC3806jh0 abstractC3806jh0, int i) {
        abstractC3806jh0.g = i;
        float[] fArrAsFloatArray = jsonValue.require("vertices").asFloatArray();
        if (i == fArrAsFloatArray.length) {
            abstractC3806jh0.f = fArrAsFloatArray;
            return;
        }
        FloatArray floatArray = new FloatArray(i * 9);
        IntArray intArray = new IntArray(i * 3);
        int length = fArrAsFloatArray.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = (int) fArrAsFloatArray[i2];
            intArray.add(i4);
            int i5 = (i4 << 2) + i3;
            while (i3 < i5) {
                intArray.add((int) fArrAsFloatArray[i3]);
                floatArray.add(fArrAsFloatArray[i3 + 1] * 1.0f);
                floatArray.add(fArrAsFloatArray[i3 + 2] * 1.0f);
                floatArray.add(fArrAsFloatArray[i3 + 3]);
                i3 += 4;
            }
            i2 = i3;
        }
        abstractC3806jh0.e = intArray.toArray();
        abstractC3806jh0.f = floatArray.toArray();
    }

    public static void q(C5167z70 c5167z70, T4 t4, int i, int i2, int i3, float f, float f2, float f3, float f4) {
        t4.g(i, i2, i3, f, f3, c5167z70.readFloat(), c5167z70.readFloat() * 1.0f, c5167z70.readFloat(), c5167z70.readFloat() * 1.0f, f2, f4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F70
    public final D70 a(FileHandle fileHandle) {
        Array array;
        Array array2;
        JsonValue jsonValue;
        float f;
        C3619hb c3619hbB;
        switch (this.b) {
            case 0:
                if (fileHandle == null) {
                    throw new IllegalArgumentException("file cannot be null.");
                }
                D70 d70I = i(fileHandle.read());
                d70I.f2957a = fileHandle.nameWithoutExtension();
                return d70I;
            default:
                if (fileHandle == null) {
                    throw new IllegalArgumentException("file cannot be null.");
                }
                JsonValue jsonValue2 = new JsonReader().parse(fileHandle);
                if (jsonValue2 == null) {
                    throw new IllegalArgumentException("root cannot be null.");
                }
                D70 d70 = new D70();
                JsonValue jsonValue3 = jsonValue2.get("skeleton");
                String str = "audio";
                String str2 = "fps";
                String str3 = "y";
                if (jsonValue3 != null) {
                    jsonValue3.getString("hash", null);
                    jsonValue3.getString("spine", null);
                    jsonValue3.getFloat("x", 0.0f);
                    jsonValue3.getFloat("y", 0.0f);
                    jsonValue3.getFloat("width", 0.0f);
                    jsonValue3.getFloat("height", 0.0f);
                    d70.l = jsonValue3.getFloat("referenceScale", 100.0f) * 1.0f;
                    jsonValue3.getFloat("fps", 30.0f);
                    jsonValue3.getString("images", null);
                    jsonValue3.getString("audio", null);
                }
                String str4 = "bones";
                JsonValue child = jsonValue2.getChild("bones");
                while (true) {
                    Array array3 = d70.b;
                    String str5 = "shearY";
                    String str6 = "scaleY";
                    String str7 = "length";
                    String str8 = str;
                    String str9 = "scaleX";
                    String str10 = str2;
                    String str11 = Key.ROTATION;
                    String str12 = str4;
                    JsonValue jsonValue4 = jsonValue2;
                    String str13 = "name";
                    if (child != null) {
                        String string = child.getString("parent", null);
                        if (string != null) {
                            c3619hbB = d70.b(string);
                            if (c3619hbB == null) {
                                throw new SerializationException("Parent bone not found: ".concat(string));
                            }
                        } else {
                            c3619hbB = null;
                        }
                        D70 d71 = d70;
                        C3619hb c3619hb = new C3619hb(array3.size, child.getString("name"), c3619hbB);
                        c3619hb.d = child.getFloat("length", 0.0f) * 1.0f;
                        c3619hb.e = child.getFloat("x", 0.0f) * 1.0f;
                        c3619hb.f = child.getFloat("y", 0.0f) * 1.0f;
                        c3619hb.g = child.getFloat(Key.ROTATION, 0.0f);
                        c3619hb.h = child.getFloat("scaleX", 1.0f);
                        c3619hb.i = child.getFloat("scaleY", 1.0f);
                        c3619hb.j = child.getFloat("shearX", 0.0f);
                        c3619hb.k = child.getFloat("shearY", 0.0f);
                        EnumC3531gb enumC3531gb = EnumC3531gb.f4419a;
                        c3619hb.l = EnumC3531gb.valueOf(child.getString("inherit", "normal"));
                        c3619hb.m = child.getBoolean("skin", false);
                        String string2 = child.getString("color", null);
                        if (string2 != null) {
                            Color.valueOf(string2, c3619hb.n);
                        }
                        child.getString(RewardPlus.ICON, null);
                        child.getBoolean("visible", true);
                        array3.add(c3619hb);
                        child = child.next;
                        str = str8;
                        str2 = str10;
                        str4 = str12;
                        jsonValue2 = jsonValue4;
                        d70 = d71;
                    } else {
                        D70 d72 = d70;
                        String str14 = "color";
                        JsonValue jsonValue5 = jsonValue4;
                        JsonValue child2 = jsonValue5.getChild("slots");
                        while (true) {
                            Array array4 = d72.c;
                            String str15 = str7;
                            String str16 = "bone";
                            if (child2 != null) {
                                String str17 = str5;
                                String string3 = child2.getString("name");
                                String string4 = child2.getString("bone");
                                String str18 = str6;
                                C3619hb c3619hbB2 = d72.b(string4);
                                if (c3619hbB2 == null) {
                                    throw new SerializationException("Slot bone not found: ".concat(string4));
                                }
                                String str19 = str9;
                                O70 o70 = new O70(array4.size, string3, c3619hbB2);
                                String string5 = child2.getString(str14, null);
                                if (string5 != null) {
                                    Color.valueOf(string5, o70.d);
                                }
                                String string6 = child2.getString("dark", null);
                                if (string6 != null) {
                                    o70.e = Color.valueOf(string6);
                                }
                                o70.f = child2.getString("attachment", null);
                                EnumC2563La enumC2563La = EnumC2563La.normal;
                                o70.g = EnumC2563La.valueOf(child2.getString("blend", "normal"));
                                child2.getBoolean("visible", true);
                                array4.add(o70);
                                child2 = child2.next;
                                str7 = str15;
                                str5 = str17;
                                str6 = str18;
                                str9 = str19;
                            } else {
                                String str20 = str9;
                                String str21 = str6;
                                String str22 = str5;
                                String str23 = "ik";
                                JsonValue child3 = jsonValue5.getChild("ik");
                                while (true) {
                                    Array array5 = d72.h;
                                    String str24 = "mix";
                                    if (child3 != null) {
                                        Array array6 = array4;
                                        String str25 = str14;
                                        C3505gC c3505gC = new C3505gC(child3.getString("name"));
                                        c3505gC.b = child3.getInt("order", 0);
                                        c3505gC.c = child3.getBoolean("skin", false);
                                        String str26 = str12;
                                        JsonValue child4 = child3.getChild(str26);
                                        while (child4 != null) {
                                            String str27 = str23;
                                            C3619hb c3619hbB3 = d72.b(child4.asString());
                                            if (c3619hbB3 == null) {
                                                throw new SerializationException("IK bone not found: " + child4);
                                            }
                                            c3505gC.d.add(c3619hbB3);
                                            child4 = child4.next;
                                            str23 = str27;
                                            str16 = str16;
                                        }
                                        String str28 = str16;
                                        String str29 = str23;
                                        String string7 = child3.getString("target");
                                        C3619hb c3619hbB4 = d72.b(string7);
                                        c3505gC.e = c3619hbB4;
                                        if (c3619hbB4 == null) {
                                            throw new SerializationException("IK target bone not found: ".concat(string7));
                                        }
                                        c3505gC.j = child3.getFloat("mix", 1.0f);
                                        c3505gC.k = child3.getFloat("softness", 0.0f) * 1.0f;
                                        c3505gC.f = child3.getBoolean("bendPositive", true) ? 1 : -1;
                                        c3505gC.g = child3.getBoolean("compress", false);
                                        c3505gC.h = child3.getBoolean("stretch", false);
                                        c3505gC.i = child3.getBoolean("uniform", false);
                                        array5.add(c3505gC);
                                        child3 = child3.next;
                                        str23 = str29;
                                        array4 = array6;
                                        str16 = str28;
                                        str12 = str26;
                                        str14 = str25;
                                    } else {
                                        String str30 = str16;
                                        String str31 = str14;
                                        Array array7 = array4;
                                        String str32 = str12;
                                        String str33 = str23;
                                        String str34 = "transform";
                                        JsonValue child5 = jsonValue5.getChild("transform");
                                        while (true) {
                                            Array array8 = array5;
                                            if (child5 != null) {
                                                String str35 = str34;
                                                String str36 = str24;
                                                Ed0 ed0 = new Ed0(child5.getString(str13));
                                                String str37 = str13;
                                                ed0.b = child5.getInt("order", 0);
                                                ed0.c = child5.getBoolean("skin", false);
                                                JsonValue child6 = child5.getChild(str32);
                                                while (child6 != null) {
                                                    C3619hb c3619hbB5 = d72.b(child6.asString());
                                                    if (c3619hbB5 == null) {
                                                        throw new SerializationException("Transform constraint bone not found: " + child6);
                                                    }
                                                    ed0.d.add(c3619hbB5);
                                                    child6 = child6.next;
                                                    str32 = str32;
                                                }
                                                String str38 = str32;
                                                String string8 = child5.getString("target");
                                                C3619hb c3619hbB6 = d72.b(string8);
                                                ed0.e = c3619hbB6;
                                                if (c3619hbB6 == null) {
                                                    throw new SerializationException("Transform constraint target bone not found: ".concat(string8));
                                                }
                                                ed0.s = child5.getBoolean("local", false);
                                                ed0.r = child5.getBoolean("relative", false);
                                                ed0.l = child5.getFloat(Key.ROTATION, 0.0f);
                                                ed0.m = child5.getFloat("x", 0.0f) * 1.0f;
                                                ed0.n = child5.getFloat("y", 0.0f) * 1.0f;
                                                ed0.o = child5.getFloat(str20, 0.0f);
                                                ed0.p = child5.getFloat(str21, 0.0f);
                                                ed0.q = child5.getFloat(str22, 0.0f);
                                                ed0.f = child5.getFloat("mixRotate", 1.0f);
                                                float f2 = child5.getFloat("mixX", 1.0f);
                                                ed0.g = f2;
                                                ed0.h = child5.getFloat("mixY", f2);
                                                float f3 = child5.getFloat("mixScaleX", 1.0f);
                                                ed0.i = f3;
                                                ed0.j = child5.getFloat("mixScaleY", f3);
                                                ed0.k = child5.getFloat("mixShearY", 1.0f);
                                                d72.i.add(ed0);
                                                child5 = child5.next;
                                                array5 = array8;
                                                str34 = str35;
                                                str24 = str36;
                                                str13 = str37;
                                                str32 = str38;
                                            } else {
                                                String str39 = str34;
                                                String str40 = str24;
                                                String str41 = str13;
                                                String str42 = str32;
                                                String str43 = MBridgeConstans.DYNAMIC_VIEW_WX_PATH;
                                                JsonValue child7 = jsonValue5.getChild(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
                                                while (child7 != null) {
                                                    String str44 = str41;
                                                    TT tt = new TT(child7.getString(str44));
                                                    String str45 = str43;
                                                    tt.b = child7.getInt("order", 0);
                                                    tt.c = child7.getBoolean("skin", false);
                                                    String str46 = str42;
                                                    JsonValue child8 = child7.getChild(str46);
                                                    while (child8 != null) {
                                                        String str47 = str46;
                                                        C3619hb c3619hbB7 = d72.b(child8.asString());
                                                        if (c3619hbB7 == null) {
                                                            throw new SerializationException("Path bone not found: " + child8);
                                                        }
                                                        tt.d.add(c3619hbB7);
                                                        child8 = child8.next;
                                                        str3 = str3;
                                                        str46 = str47;
                                                    }
                                                    str42 = str46;
                                                    String str48 = str3;
                                                    String string9 = child7.getString("target");
                                                    O70 o70H = d72.h(string9);
                                                    tt.e = o70H;
                                                    if (o70H == null) {
                                                        throw new SerializationException("Path target slot not found: ".concat(string9));
                                                    }
                                                    tt.f = QT.valueOf(child7.getString("positionMode", "percent"));
                                                    String str49 = str15;
                                                    tt.g = ST.valueOf(child7.getString("spacingMode", str49));
                                                    tt.h = RT.valueOf(child7.getString("rotateMode", "tangent"));
                                                    tt.i = child7.getFloat(str11, 0.0f);
                                                    float f4 = child7.getFloat("position", 0.0f);
                                                    tt.j = f4;
                                                    String str50 = str11;
                                                    if (tt.f == QT.f3603a) {
                                                        tt.j = f4 * 1.0f;
                                                    }
                                                    float f5 = child7.getFloat("spacing", 0.0f);
                                                    tt.k = f5;
                                                    ST st = tt.g;
                                                    if (st == ST.f3715a || st == ST.b) {
                                                        f = 1.0f;
                                                        tt.k = f5 * 1.0f;
                                                    } else {
                                                        f = 1.0f;
                                                    }
                                                    tt.l = child7.getFloat("mixRotate", f);
                                                    tt.m = child7.getFloat("mixX", f);
                                                    tt.n = child7.getFloat("mixY", f);
                                                    d72.j.add(tt);
                                                    child7 = child7.next;
                                                    str41 = str44;
                                                    str11 = str50;
                                                    str43 = str45;
                                                    str15 = str49;
                                                    str3 = str48;
                                                }
                                                String str51 = str43;
                                                String str52 = str3;
                                                String str53 = str41;
                                                String str54 = "physics";
                                                for (JsonValue child9 = jsonValue5.getChild("physics"); child9 != null; child9 = child9.next) {
                                                    C4137nU c4137nU = new C4137nU(child9.getString(str53));
                                                    c4137nU.b = child9.getInt("order", 0);
                                                    c4137nU.c = child9.getBoolean("skin", false);
                                                    String str55 = str30;
                                                    String string10 = child9.getString(str55);
                                                    C3619hb c3619hbB8 = d72.b(string10);
                                                    c4137nU.d = c3619hbB8;
                                                    if (c3619hbB8 == null) {
                                                        throw new SerializationException("Physics bone not found: ".concat(string10));
                                                    }
                                                    c4137nU.e = child9.getFloat("x", 0.0f);
                                                    c4137nU.f = child9.getFloat(str52, 0.0f);
                                                    c4137nU.g = child9.getFloat("rotate", 0.0f);
                                                    c4137nU.h = child9.getFloat(str20, 0.0f);
                                                    c4137nU.i = child9.getFloat("shearX", 0.0f);
                                                    c4137nU.j = child9.getFloat("limit", 5000.0f) * 1.0f;
                                                    c4137nU.k = 1.0f / child9.getInt(str10, 60);
                                                    c4137nU.l = child9.getFloat("inertia", 1.0f);
                                                    c4137nU.m = child9.getFloat("strength", 100.0f);
                                                    c4137nU.n = child9.getFloat("damping", 1.0f);
                                                    c4137nU.o = 1.0f / child9.getFloat("mass", 1.0f);
                                                    c4137nU.p = child9.getFloat("wind", 0.0f);
                                                    c4137nU.q = child9.getFloat("gravity", 0.0f);
                                                    str30 = str55;
                                                    c4137nU.r = child9.getFloat(str40, 1.0f);
                                                    c4137nU.s = child9.getBoolean("inertiaGlobal", false);
                                                    c4137nU.t = child9.getBoolean("strengthGlobal", false);
                                                    c4137nU.u = child9.getBoolean("dampingGlobal", false);
                                                    c4137nU.v = child9.getBoolean("massGlobal", false);
                                                    c4137nU.w = child9.getBoolean("windGlobal", false);
                                                    c4137nU.x = child9.getBoolean("gravityGlobal", false);
                                                    c4137nU.y = child9.getBoolean("mixGlobal", false);
                                                    d72.k.add(c4137nU);
                                                }
                                                JsonValue child10 = jsonValue5.getChild("skins");
                                                while (true) {
                                                    Array array9 = d72.d;
                                                    if (child10 != null) {
                                                        I70 i70 = new I70(child10.getString(str53));
                                                        String str56 = str42;
                                                        JsonValue child11 = child10.getChild(str56);
                                                        while (true) {
                                                            array = i70.c;
                                                            if (child11 != null) {
                                                                C3619hb c3619hbB9 = d72.b(child11.asString());
                                                                if (c3619hbB9 == null) {
                                                                    throw new SerializationException("Skin bone not found: " + child11);
                                                                }
                                                                array.add(c3619hbB9);
                                                                child11 = child11.next;
                                                            }
                                                        }
                                                        array.shrink();
                                                        String str57 = str33;
                                                        JsonValue child12 = child10.getChild(str57);
                                                        while (true) {
                                                            array2 = i70.d;
                                                            if (child12 != null) {
                                                                C3505gC c3505gCD = d72.d(child12.asString());
                                                                if (c3505gCD == null) {
                                                                    throw new SerializationException("Skin IK constraint not found: " + child12);
                                                                }
                                                                array2.add(c3505gCD);
                                                                child12 = child12.next;
                                                            }
                                                        }
                                                        String str58 = str39;
                                                        for (JsonValue child13 = child10.getChild(str58); child13 != null; child13 = child13.next) {
                                                            Ed0 ed0I = d72.i(child13.asString());
                                                            if (ed0I == null) {
                                                                throw new SerializationException("Skin transform constraint not found: " + child13);
                                                            }
                                                            array2.add(ed0I);
                                                        }
                                                        String str59 = str51;
                                                        for (JsonValue child14 = child10.getChild(str59); child14 != null; child14 = child14.next) {
                                                            TT ttE = d72.e(child14.asString());
                                                            if (ttE == null) {
                                                                throw new SerializationException("Skin path constraint not found: " + child14);
                                                            }
                                                            array2.add(ttE);
                                                        }
                                                        for (JsonValue child15 = child10.getChild(str54); child15 != null; child15 = child15.next) {
                                                            C4137nU c4137nUF = d72.f(child15.asString());
                                                            if (c4137nUF == null) {
                                                                throw new SerializationException("Skin physics constraint not found: " + child15);
                                                            }
                                                            array2.add(c4137nUF);
                                                        }
                                                        array2.shrink();
                                                        JsonValue child16 = child10.getChild("attachments");
                                                        while (child16 != null) {
                                                            O70 o70H2 = d72.h(child16.name);
                                                            if (o70H2 == null) {
                                                                throw new SerializationException("Slot not found: " + child16.name);
                                                            }
                                                            JsonValue jsonValue6 = child16.child;
                                                            while (jsonValue6 != null) {
                                                                try {
                                                                    String str60 = str54;
                                                                    JsonValue jsonValue7 = jsonValue6;
                                                                    String str61 = str53;
                                                                    JsonValue jsonValue8 = jsonValue5;
                                                                    String str62 = str56;
                                                                    O70 o71 = o70H2;
                                                                    JsonValue jsonValue9 = child16;
                                                                    try {
                                                                        AbstractC3413f9 abstractC3413f9D = d(jsonValue6, i70, o70H2.f3494a, jsonValue6.name, d72);
                                                                        if (abstractC3413f9D != null) {
                                                                            jsonValue = jsonValue7;
                                                                            try {
                                                                                i70.b(o71.f3494a, jsonValue.name, abstractC3413f9D);
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                throw new SerializationException("Error reading attachment: " + jsonValue.name + ", skin: " + i70, th);
                                                                            }
                                                                        } else {
                                                                            jsonValue = jsonValue7;
                                                                        }
                                                                        jsonValue6 = jsonValue.next;
                                                                        child16 = jsonValue9;
                                                                        jsonValue5 = jsonValue8;
                                                                        o70H2 = o71;
                                                                        str54 = str60;
                                                                        str53 = str61;
                                                                        str56 = str62;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        jsonValue = jsonValue7;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    jsonValue = jsonValue6;
                                                                }
                                                            }
                                                            child16 = child16.next;
                                                            str54 = str54;
                                                            str53 = str53;
                                                        }
                                                        String str63 = str54;
                                                        String str64 = str53;
                                                        str42 = str56;
                                                        String str65 = str31;
                                                        JsonValue jsonValue10 = jsonValue5;
                                                        String string11 = child10.getString(str65, null);
                                                        if (string11 != null) {
                                                            Color.valueOf(string11, i70.f);
                                                        }
                                                        array9.add(i70);
                                                        if (i70.f3204a.equals(MRAIDCommunicatorUtil.STATES_DEFAULT)) {
                                                            d72.e = i70;
                                                        }
                                                        child10 = child10.next;
                                                        str31 = str65;
                                                        jsonValue5 = jsonValue10;
                                                        str33 = str57;
                                                        str39 = str58;
                                                        str51 = str59;
                                                        str54 = str63;
                                                        str53 = str64;
                                                    } else {
                                                        JsonValue jsonValue11 = jsonValue5;
                                                        Array array10 = this.c;
                                                        Object[] objArr = array10.items;
                                                        int i = array10.size;
                                                        for (int i2 = 0; i2 < i; i2++) {
                                                            E70 e70 = (E70) objArr[i2];
                                                            String str66 = e70.b;
                                                            I70 i70G = str66 == null ? d72.e : d72.g(str66);
                                                            if (i70G == null) {
                                                                throw new SerializationException("Skin not found: " + e70.b);
                                                            }
                                                            int i3 = e70.c;
                                                            String str67 = e70.f3009a;
                                                            AbstractC3413f9 abstractC3413f9A = i70G.a(i3, str67);
                                                            if (abstractC3413f9A == null) {
                                                                throw new SerializationException(AbstractC3888ke0.i("Parent mesh not found: ", str67));
                                                            }
                                                            boolean z = e70.e;
                                                            C3780jP c3780jP = e70.d;
                                                            c3780jP.d = z ? (AbstractC3806jh0) abstractC3413f9A : c3780jP;
                                                            c3780jP.j((C3780jP) abstractC3413f9A);
                                                            if (c3780jP.i != null) {
                                                                c3780jP.b();
                                                            }
                                                        }
                                                        array10.clear();
                                                        JsonValue child17 = jsonValue11.getChild(com.umeng.analytics.pro.f.ax);
                                                        while (true) {
                                                            Array array11 = d72.f;
                                                            if (child17 == null) {
                                                                for (JsonValue child18 = jsonValue11.getChild("animations"); child18 != null; child18 = child18.next) {
                                                                    try {
                                                                        c(child18, child18.name, d72);
                                                                    } catch (Throwable th4) {
                                                                        throw new SerializationException("Error reading animation: " + child18.name, th4);
                                                                    }
                                                                }
                                                                array3.shrink();
                                                                array7.shrink();
                                                                array9.shrink();
                                                                array11.shrink();
                                                                d72.g.shrink();
                                                                array8.shrink();
                                                                d72.f2957a = fileHandle.nameWithoutExtension();
                                                                return d72;
                                                            }
                                                            C2735Rr c2735Rr = new C2735Rr(child17.name);
                                                            c2735Rr.b = child17.getInt("int", 0);
                                                            c2735Rr.c = child17.getFloat(TypedValues.Custom.S_FLOAT, 0.0f);
                                                            c2735Rr.d = child17.getString(TypedValues.Custom.S_STRING, "");
                                                            String str68 = str8;
                                                            String string12 = child17.getString(str68, null);
                                                            c2735Rr.e = string12;
                                                            if (string12 != null) {
                                                                c2735Rr.f = child17.getFloat("volume", 1.0f);
                                                                c2735Rr.g = child17.getFloat("balance", 0.0f);
                                                            }
                                                            array11.add(c2735Rr);
                                                            child17 = child17.next;
                                                            str8 = str68;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public final AbstractC3413f9 d(JsonValue jsonValue, I70 i70, int i, String str, D70 d70) {
        String string = jsonValue.getString("name", str);
        U6[] u6Arr = U6.f3811a;
        int iOrdinal = U6.valueOf(jsonValue.getString("type", TtmlNode.TAG_REGION)).ordinal();
        L6 l6 = this.f3054a;
        switch (iOrdinal) {
            case 0:
                String string2 = jsonValue.getString(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, string);
                C4633t40 c4633t40G = g(jsonValue.get("sequence"));
                C3527gY c3527gYC = l6.c(string, string2, c4633t40G);
                c3527gYC.d = jsonValue.getFloat("x", 0.0f) * 1.0f;
                c3527gYC.e = jsonValue.getFloat("y", 0.0f) * 1.0f;
                c3527gYC.f = jsonValue.getFloat("scaleX", 1.0f);
                c3527gYC.g = jsonValue.getFloat("scaleY", 1.0f);
                c3527gYC.h = jsonValue.getFloat(Key.ROTATION, 0.0f);
                c3527gYC.i = jsonValue.getFloat("width") * 1.0f;
                c3527gYC.j = jsonValue.getFloat("height") * 1.0f;
                c3527gYC.n = c4633t40G;
                String string3 = jsonValue.getString("color", null);
                if (string3 != null) {
                    Color.valueOf(string3, c3527gYC.m);
                }
                if (c3527gYC.c != null) {
                    c3527gYC.b();
                }
                return c3527gYC;
            case 1:
                l6.getClass();
                C4584sb c4584sb = new C4584sb(string);
                p(jsonValue, c4584sb, jsonValue.getInt("vertexCount") << 1);
                String string4 = jsonValue.getString("color", null);
                if (string4 != null) {
                    Color.valueOf(string4, c4584sb.i);
                }
                return c4584sb;
            case 2:
            case 3:
                String string5 = jsonValue.getString(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, string);
                C4633t40 c4633t40G2 = g(jsonValue.get("sequence"));
                C3780jP c3780jPB = l6.b(string, string5, c4633t40G2);
                String string6 = jsonValue.getString("color", null);
                if (string6 != null) {
                    Color.valueOf(string6, c3780jPB.m);
                }
                jsonValue.getFloat("width", 0.0f);
                jsonValue.getFloat("height", 0.0f);
                c3780jPB.n = c4633t40G2;
                String string7 = jsonValue.getString("parent", null);
                if (string7 != null) {
                    Array array = this.c;
                    String string8 = jsonValue.getString("skin", null);
                    boolean z = jsonValue.getBoolean("timelines", true);
                    E70 e70 = new E70();
                    e70.d = c3780jPB;
                    e70.b = string8;
                    e70.c = i;
                    e70.f3009a = string7;
                    e70.e = z;
                    array.add(e70);
                    return c3780jPB;
                }
                float[] fArrAsFloatArray = jsonValue.require("uvs").asFloatArray();
                p(jsonValue, c3780jPB, fArrAsFloatArray.length);
                c3780jPB.l = jsonValue.require("triangles").asShortArray();
                c3780jPB.j = fArrAsFloatArray;
                if (c3780jPB.i != null) {
                    c3780jPB.b();
                }
                if (jsonValue.has("hull")) {
                    jsonValue.require("hull").asInt();
                }
                if (jsonValue.has("edges")) {
                    jsonValue.require("edges").asShortArray();
                }
                return c3780jPB;
            case 4:
                l6.getClass();
                OT ot = new OT(string);
                int i2 = 0;
                ot.j = jsonValue.getBoolean("closed", false);
                ot.k = jsonValue.getBoolean("constantSpeed", true);
                int i3 = jsonValue.getInt("vertexCount");
                p(jsonValue, ot, i3 << 1);
                float[] fArr = new float[i3 / 3];
                JsonValue jsonValue2 = jsonValue.require("lengths").child;
                while (jsonValue2 != null) {
                    fArr[i2] = jsonValue2.asFloat() * 1.0f;
                    jsonValue2 = jsonValue2.next;
                    i2++;
                }
                ot.i = fArr;
                String string9 = jsonValue.getString("color", null);
                if (string9 != null) {
                    Color.valueOf(string9, ot.l);
                }
                return ot;
            case 5:
                l6.getClass();
                C3436fV c3436fV = new C3436fV(string);
                jsonValue.getFloat("x", 0.0f);
                jsonValue.getFloat("y", 0.0f);
                jsonValue.getFloat(Key.ROTATION, 0.0f);
                String string10 = jsonValue.getString("color", null);
                if (string10 != null) {
                    Color.valueOf(string10, c3436fV.c);
                }
                return c3436fV;
            case 6:
                l6.getClass();
                C5208zf c5208zf = new C5208zf(string);
                String string11 = jsonValue.getString(TtmlNode.END, null);
                if (string11 != null) {
                    O70 o70H = d70.h(string11);
                    if (o70H == null) {
                        throw new SerializationException("Clipping end slot not found: ".concat(string11));
                    }
                    c5208zf.i = o70H;
                }
                p(jsonValue, c5208zf, jsonValue.getInt("vertexCount") << 1);
                String string12 = jsonValue.getString("color", null);
                if (string12 != null) {
                    Color.valueOf(string12, c5208zf.j);
                }
                return c5208zf;
            default:
                return null;
        }
    }

    public final D70 i(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("dataInput cannot be null.");
        }
        C5167z70 c5167z70 = new C5167z70(inputStream);
        D70 d70 = new D70();
        try {
            try {
                long j = c5167z70.readLong();
                if (j != 0) {
                    Long.toString(j);
                }
                c5167z70.readString().isEmpty();
                c5167z70.readFloat();
                c5167z70.readFloat();
                c5167z70.readFloat();
                c5167z70.readFloat();
                d70.l = c5167z70.readFloat() * 1.0f;
                boolean z = c5167z70.readBoolean();
                if (z) {
                    c5167z70.readFloat();
                    c5167z70.readString().isEmpty();
                    c5167z70.readString().isEmpty();
                }
                int i = c5167z70.readInt(true);
                String[] strArr = new String[i];
                c5167z70.b = strArr;
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = c5167z70.readString();
                }
                Array array = d70.b;
                int i3 = c5167z70.readInt(true);
                Object[] size = array.setSize(i3);
                int i4 = 0;
                while (i4 < i3) {
                    C3619hb c3619hb = new C3619hb(i4, c5167z70.readString(), i4 == 0 ? null : (C3619hb) size[c5167z70.readInt(true)]);
                    c3619hb.g = c5167z70.readFloat();
                    c3619hb.e = c5167z70.readFloat() * 1.0f;
                    c3619hb.f = c5167z70.readFloat() * 1.0f;
                    c3619hb.h = c5167z70.readFloat();
                    c3619hb.i = c5167z70.readFloat();
                    c3619hb.j = c5167z70.readFloat();
                    c3619hb.k = c5167z70.readFloat();
                    c3619hb.d = c5167z70.readFloat() * 1.0f;
                    c3619hb.l = EnumC3531gb.d[c5167z70.readByte()];
                    c3619hb.m = c5167z70.readBoolean();
                    if (z) {
                        Color.rgba8888ToColor(c3619hb.n, c5167z70.readInt());
                        c5167z70.readString();
                        c5167z70.readBoolean();
                    }
                    size[i4] = c3619hb;
                    i4++;
                }
                Array array2 = d70.c;
                int i5 = c5167z70.readInt(true);
                Object[] size2 = array2.setSize(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    O70 o70 = new O70(i6, c5167z70.readString(), (C3619hb) size[c5167z70.readInt(true)]);
                    Color.rgba8888ToColor(o70.d, c5167z70.readInt());
                    int i7 = c5167z70.readInt();
                    if (i7 != -1) {
                        Color color = new Color();
                        o70.e = color;
                        Color.rgb888ToColor(color, i7);
                    }
                    o70.f = c5167z70.h();
                    o70.g = EnumC2563La.g[c5167z70.readInt(true)];
                    if (z) {
                        c5167z70.readBoolean();
                    }
                    size2[i6] = o70;
                }
                Array array3 = d70.h;
                int i8 = c5167z70.readInt(true);
                Object[] size3 = array3.setSize(i8);
                for (int i9 = 0; i9 < i8; i9++) {
                    C3505gC c3505gC = new C3505gC(c5167z70.readString());
                    c3505gC.b = c5167z70.readInt(true);
                    Array array4 = c3505gC.d;
                    int i10 = c5167z70.readInt(true);
                    Object[] size4 = array4.setSize(i10);
                    for (int i11 = 0; i11 < i10; i11++) {
                        size4[i11] = size[c5167z70.readInt(true)];
                    }
                    c3505gC.e = (C3619hb) size[c5167z70.readInt(true)];
                    int i12 = c5167z70.read();
                    c3505gC.c = (i12 & 1) != 0;
                    c3505gC.f = (i12 & 2) != 0 ? 1 : -1;
                    c3505gC.g = (i12 & 4) != 0;
                    c3505gC.h = (i12 & 8) != 0;
                    c3505gC.i = (i12 & 16) != 0;
                    if ((i12 & 32) != 0) {
                        c3505gC.j = (i12 & 64) != 0 ? c5167z70.readFloat() : 1.0f;
                    }
                    if ((i12 & 128) != 0) {
                        c3505gC.k = c5167z70.readFloat() * 1.0f;
                    }
                    size3[i9] = c3505gC;
                }
                Array array5 = d70.i;
                int i13 = c5167z70.readInt(true);
                Object[] size5 = array5.setSize(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    Ed0 ed0 = new Ed0(c5167z70.readString());
                    ed0.b = c5167z70.readInt(true);
                    Array array6 = ed0.d;
                    int i15 = c5167z70.readInt(true);
                    Object[] size6 = array6.setSize(i15);
                    for (int i16 = 0; i16 < i15; i16++) {
                        size6[i16] = size[c5167z70.readInt(true)];
                    }
                    ed0.e = (C3619hb) size[c5167z70.readInt(true)];
                    int i17 = c5167z70.read();
                    ed0.c = (i17 & 1) != 0;
                    ed0.s = (i17 & 2) != 0;
                    ed0.r = (i17 & 4) != 0;
                    if ((i17 & 8) != 0) {
                        ed0.l = c5167z70.readFloat();
                    }
                    if ((i17 & 16) != 0) {
                        ed0.m = c5167z70.readFloat() * 1.0f;
                    }
                    if ((i17 & 32) != 0) {
                        ed0.n = c5167z70.readFloat() * 1.0f;
                    }
                    if ((i17 & 64) != 0) {
                        ed0.o = c5167z70.readFloat();
                    }
                    if ((i17 & 128) != 0) {
                        ed0.p = c5167z70.readFloat();
                    }
                    int i18 = c5167z70.read();
                    if ((i18 & 1) != 0) {
                        ed0.q = c5167z70.readFloat();
                    }
                    if ((i18 & 2) != 0) {
                        ed0.f = c5167z70.readFloat();
                    }
                    if ((i18 & 4) != 0) {
                        ed0.g = c5167z70.readFloat();
                    }
                    if ((i18 & 8) != 0) {
                        ed0.h = c5167z70.readFloat();
                    }
                    if ((i18 & 16) != 0) {
                        ed0.i = c5167z70.readFloat();
                    }
                    if ((i18 & 32) != 0) {
                        ed0.j = c5167z70.readFloat();
                    }
                    if ((i18 & 64) != 0) {
                        ed0.k = c5167z70.readFloat();
                    }
                    size5[i14] = ed0;
                }
                Array array7 = d70.j;
                int i19 = c5167z70.readInt(true);
                Object[] size7 = array7.setSize(i19);
                for (int i20 = 0; i20 < i19; i20++) {
                    TT tt = new TT(c5167z70.readString());
                    tt.b = c5167z70.readInt(true);
                    tt.c = c5167z70.readBoolean();
                    Array array8 = tt.d;
                    int i21 = c5167z70.readInt(true);
                    Object[] size8 = array8.setSize(i21);
                    for (int i22 = 0; i22 < i21; i22++) {
                        size8[i22] = size[c5167z70.readInt(true)];
                    }
                    tt.e = (O70) size2[c5167z70.readInt(true)];
                    int i23 = c5167z70.read();
                    tt.f = QT.c[i23 & 1];
                    tt.g = ST.c[(i23 >> 1) & 3];
                    tt.h = RT.d[(i23 >> 3) & 3];
                    if ((i23 & 128) != 0) {
                        tt.i = c5167z70.readFloat();
                    }
                    float f = c5167z70.readFloat();
                    tt.j = f;
                    if (tt.f == QT.f3603a) {
                        tt.j = f * 1.0f;
                    }
                    float f2 = c5167z70.readFloat();
                    tt.k = f2;
                    ST st = tt.g;
                    if (st == ST.f3715a || st == ST.b) {
                        tt.k = f2 * 1.0f;
                    }
                    tt.l = c5167z70.readFloat();
                    tt.m = c5167z70.readFloat();
                    tt.n = c5167z70.readFloat();
                    size7[i20] = tt;
                }
                Array array9 = d70.k;
                int i24 = c5167z70.readInt(true);
                Object[] size9 = array9.setSize(i24);
                for (int i25 = 0; i25 < i24; i25++) {
                    C4137nU c4137nU = new C4137nU(c5167z70.readString());
                    c4137nU.b = c5167z70.readInt(true);
                    c4137nU.d = (C3619hb) size[c5167z70.readInt(true)];
                    int i26 = c5167z70.read();
                    c4137nU.c = (i26 & 1) != 0;
                    if ((i26 & 2) != 0) {
                        c4137nU.e = c5167z70.readFloat();
                    }
                    if ((i26 & 4) != 0) {
                        c4137nU.f = c5167z70.readFloat();
                    }
                    if ((i26 & 8) != 0) {
                        c4137nU.g = c5167z70.readFloat();
                    }
                    if ((i26 & 16) != 0) {
                        c4137nU.h = c5167z70.readFloat();
                    }
                    if ((i26 & 32) != 0) {
                        c4137nU.i = c5167z70.readFloat();
                    }
                    c4137nU.j = ((i26 & 64) != 0 ? c5167z70.readFloat() : 5000.0f) * 1.0f;
                    c4137nU.k = 1.0f / c5167z70.readUnsignedByte();
                    c4137nU.l = c5167z70.readFloat();
                    c4137nU.m = c5167z70.readFloat();
                    c4137nU.n = c5167z70.readFloat();
                    c4137nU.o = (i26 & 128) != 0 ? c5167z70.readFloat() : 1.0f;
                    c4137nU.p = c5167z70.readFloat();
                    c4137nU.q = c5167z70.readFloat();
                    int i27 = c5167z70.read();
                    if ((i27 & 1) != 0) {
                        c4137nU.s = true;
                    }
                    if ((i27 & 2) != 0) {
                        c4137nU.t = true;
                    }
                    if ((i27 & 4) != 0) {
                        c4137nU.u = true;
                    }
                    if ((i27 & 8) != 0) {
                        c4137nU.v = true;
                    }
                    if ((i27 & 16) != 0) {
                        c4137nU.w = true;
                    }
                    if ((i27 & 32) != 0) {
                        c4137nU.x = true;
                    }
                    if ((i27 & 64) != 0) {
                        c4137nU.y = true;
                    }
                    c4137nU.r = (i27 & 128) != 0 ? c5167z70.readFloat() : 1.0f;
                    size9[i25] = c4137nU;
                }
                I70 i70J = j(c5167z70, d70, true, z);
                Array array10 = d70.d;
                if (i70J != null) {
                    d70.e = i70J;
                    array10.add(i70J);
                }
                int i28 = array10.size;
                int i29 = c5167z70.readInt(true) + i28;
                Object[] size10 = array10.setSize(i29);
                while (i28 < i29) {
                    size10[i28] = j(c5167z70, d70, false, z);
                    i28++;
                }
                Array array11 = this.c;
                int i30 = array11.size;
                Object[] objArr = array11.items;
                for (int i31 = 0; i31 < i30; i31++) {
                    C5079y70 c5079y70 = (C5079y70) objArr[i31];
                    int i32 = c5079y70.b;
                    String str = c5079y70.f5263a;
                    AbstractC3413f9 abstractC3413f9A = ((I70) array10.get(i32)).a(c5079y70.c, str);
                    if (abstractC3413f9A == null) {
                        throw new SerializationException("Parent mesh not found: " + str);
                    }
                    boolean z2 = c5079y70.e;
                    C3780jP c3780jP = c5079y70.d;
                    c3780jP.d = z2 ? (AbstractC3806jh0) abstractC3413f9A : c3780jP;
                    c3780jP.j((C3780jP) abstractC3413f9A);
                    if (c3780jP.a() == null) {
                        c3780jP.b();
                    }
                }
                array11.clear();
                Array array12 = d70.f;
                int i33 = c5167z70.readInt(true);
                Object[] size11 = array12.setSize(i33);
                for (int i34 = 0; i34 < i33; i34++) {
                    C2735Rr c2735Rr = new C2735Rr(c5167z70.readString());
                    c2735Rr.b = c5167z70.readInt(false);
                    c2735Rr.c = c5167z70.readFloat();
                    c2735Rr.d = c5167z70.readString();
                    String string = c5167z70.readString();
                    c2735Rr.e = string;
                    if (string != null) {
                        c2735Rr.f = c5167z70.readFloat();
                        c2735Rr.g = c5167z70.readFloat();
                    }
                    size11[i34] = c2735Rr;
                }
                Array array13 = d70.g;
                int i35 = c5167z70.readInt(true);
                Object[] size12 = array13.setSize(i35);
                for (int i36 = 0; i36 < i35; i36++) {
                    size12[i36] = b(c5167z70, c5167z70.readString(), d70);
                }
                try {
                    c5167z70.close();
                } catch (IOException unused) {
                }
                return d70;
            } catch (IOException e) {
                throw new SerializationException("Error reading skeleton file.", e);
            }
        } catch (Throwable th) {
            try {
                c5167z70.close();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    public final I70 j(C5167z70 c5167z70, D70 d70, boolean z, boolean z2) throws IOException {
        Array array;
        int i;
        I70 i70;
        int i2;
        int i3;
        int i4;
        C3527gY c3527gYC;
        C4584sb c4584sb;
        AbstractC3413f9 abstractC3413f9;
        AbstractC3413f9 abstractC3413f10;
        AbstractC3413f9 abstractC3413f11;
        D70 d71 = d70;
        boolean z3 = true;
        if (z) {
            i = c5167z70.readInt(true);
            if (i == 0) {
                return null;
            }
            i70 = new I70(MRAIDCommunicatorUtil.STATES_DEFAULT);
        } else {
            I70 i71 = new I70(c5167z70.readString());
            if (z2) {
                Color.rgba8888ToColor(i71.f, c5167z70.readInt());
            }
            Array array2 = i71.c;
            Object[] size = array2.setSize(c5167z70.readInt(true));
            Object[] objArr = d71.b.items;
            int i5 = array2.size;
            for (int i6 = 0; i6 < i5; i6++) {
                size[i6] = objArr[c5167z70.readInt(true)];
            }
            Object[] objArr2 = d71.h.items;
            int i7 = c5167z70.readInt(true);
            int i8 = 0;
            while (true) {
                array = i71.d;
                if (i8 >= i7) {
                    break;
                }
                array.add((AbstractC2468Hj) objArr2[c5167z70.readInt(true)]);
                i8++;
            }
            Object[] objArr3 = d71.i.items;
            int i9 = c5167z70.readInt(true);
            for (int i10 = 0; i10 < i9; i10++) {
                array.add((AbstractC2468Hj) objArr3[c5167z70.readInt(true)]);
            }
            Object[] objArr4 = d71.j.items;
            int i11 = c5167z70.readInt(true);
            for (int i12 = 0; i12 < i11; i12++) {
                array.add((AbstractC2468Hj) objArr4[c5167z70.readInt(true)]);
            }
            Object[] objArr5 = d71.k.items;
            int i13 = c5167z70.readInt(true);
            for (int i14 = 0; i14 < i13; i14++) {
                array.add((AbstractC2468Hj) objArr5[c5167z70.readInt(true)]);
            }
            array.shrink();
            i = c5167z70.readInt(true);
            i70 = i71;
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = c5167z70.readInt(z3);
            int i17 = c5167z70.readInt(z3);
            int i18 = 0;
            while (i18 < i17) {
                String strH = c5167z70.h();
                byte b = c5167z70.readByte();
                String strH2 = (b & 8) != 0 ? c5167z70.h() : strH;
                int iOrdinal = U6.f3811a[b & 7].ordinal();
                L6 l6 = this.f3054a;
                switch (iOrdinal) {
                    case 0:
                        i2 = i;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        String strH3 = (b & com.umeng.analytics.pro.cw.n) != 0 ? c5167z70.h() : null;
                        int i19 = (b & 32) != 0 ? c5167z70.readInt() : -1;
                        C4633t40 c4633t40H = (b & 64) != 0 ? h(c5167z70) : null;
                        float f = (b & 128) != 0 ? c5167z70.readFloat() : 0.0f;
                        float f2 = c5167z70.readFloat();
                        float f3 = c5167z70.readFloat();
                        float f4 = c5167z70.readFloat();
                        float f5 = c5167z70.readFloat();
                        float f6 = c5167z70.readFloat();
                        float f7 = c5167z70.readFloat();
                        if (strH3 == null) {
                            strH3 = strH2;
                        }
                        c3527gYC = l6.c(strH2, strH3, c4633t40H);
                        c3527gYC.d = f2 * 1.0f;
                        c3527gYC.e = f3 * 1.0f;
                        c3527gYC.f = f4;
                        c3527gYC.g = f5;
                        c3527gYC.h = f;
                        c3527gYC.i = f6 * 1.0f;
                        c3527gYC.j = f7 * 1.0f;
                        Color.rgba8888ToColor(c3527gYC.m, i19);
                        c3527gYC.n = c4633t40H;
                        abstractC3413f11 = c3527gYC;
                        if (c4633t40H == null) {
                            c3527gYC.b();
                        }
                        break;
                    case 1:
                        i2 = i;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        A70 a70O = o(c5167z70, (b & com.umeng.analytics.pro.cw.n) != 0);
                        int i20 = z2 ? c5167z70.readInt() : 0;
                        l6.getClass();
                        c4584sb = new C4584sb(strH2);
                        c4584sb.g = a70O.b;
                        c4584sb.f = (float[]) a70O.d;
                        c4584sb.e = (int[]) a70O.c;
                        abstractC3413f11 = c4584sb;
                        if (z2) {
                            Color.rgba8888ToColor(c4584sb.i, i20);
                        }
                        break;
                    case 2:
                        i2 = i;
                        String strH4 = (b & com.umeng.analytics.pro.cw.n) != 0 ? c5167z70.h() : strH2;
                        int i21 = (b & 32) != 0 ? c5167z70.readInt() : -1;
                        C4633t40 c4633t40H2 = (b & 64) != 0 ? h(c5167z70) : null;
                        int i22 = c5167z70.readInt(true);
                        A70 a70O2 = o(c5167z70, (b & 128) != 0);
                        float[] fArrF = f(c5167z70, a70O2.b);
                        int i23 = ((a70O2.b - i22) - 2) * 3;
                        short[] sArr = new short[i23];
                        i4 = i17;
                        int i24 = 0;
                        while (i24 < i23) {
                            sArr[i24] = (short) c5167z70.readInt(true);
                            i24++;
                            i23 = i23;
                            i15 = i15;
                        }
                        i3 = i15;
                        if (z2) {
                            int i25 = c5167z70.readInt(true);
                            short[] sArr2 = new short[i25];
                            int i26 = 0;
                            while (i26 < i25) {
                                sArr2[i26] = (short) c5167z70.readInt(true);
                                i26++;
                                i25 = i25;
                            }
                            c5167z70.readFloat();
                            c5167z70.readFloat();
                        }
                        C3780jP c3780jPB = l6.b(strH2, strH4, c4633t40H2);
                        Color.rgba8888ToColor(c3780jPB.m, i21);
                        c3780jPB.e = (int[]) a70O2.c;
                        c3780jPB.f = (float[]) a70O2.d;
                        c3780jPB.g = a70O2.b;
                        c3780jPB.l = sArr;
                        c3780jPB.j = fArrF;
                        if (c4633t40H2 == null) {
                            c3780jPB.b();
                        }
                        c3780jPB.n = c4633t40H2;
                        abstractC3413f11 = c3780jPB;
                        break;
                    case 3:
                        i2 = i;
                        String strH5 = (b & com.umeng.analytics.pro.cw.n) != 0 ? c5167z70.h() : strH2;
                        int i27 = (b & 32) != 0 ? c5167z70.readInt() : -1;
                        C4633t40 c4633t40H3 = (b & 64) != 0 ? h(c5167z70) : null;
                        boolean z4 = (b & 128) != 0;
                        int i28 = c5167z70.readInt(true);
                        String strH6 = c5167z70.h();
                        if (z2) {
                            c5167z70.readFloat();
                            c5167z70.readFloat();
                        }
                        C3780jP c3780jPB2 = l6.b(strH2, strH5, c4633t40H3);
                        Color.rgba8888ToColor(c3780jPB2.m, i27);
                        c3780jPB2.n = c4633t40H3;
                        Array array3 = this.c;
                        C5079y70 c5079y70 = new C5079y70();
                        c5079y70.d = c3780jPB2;
                        c5079y70.b = i28;
                        c5079y70.c = i16;
                        c5079y70.f5263a = strH6;
                        c5079y70.e = z4;
                        array3.add(c5079y70);
                        abstractC3413f9 = c3780jPB2;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        abstractC3413f11 = abstractC3413f9;
                        break;
                    case 4:
                        boolean z5 = (b & com.umeng.analytics.pro.cw.n) != 0;
                        boolean z6 = (b & 32) != 0;
                        A70 a70O3 = o(c5167z70, (b & 64) != 0);
                        int i29 = a70O3.b / 6;
                        float[] fArr = new float[i29];
                        i2 = i;
                        for (int i30 = 0; i30 < i29; i30++) {
                            fArr[i30] = c5167z70.readFloat() * 1.0f;
                        }
                        int i31 = z2 ? c5167z70.readInt() : 0;
                        l6.getClass();
                        OT ot = new OT(strH2);
                        ot.j = z5;
                        ot.k = z6;
                        ot.g = a70O3.b;
                        ot.f = (float[]) a70O3.d;
                        ot.e = (int[]) a70O3.c;
                        ot.i = fArr;
                        abstractC3413f9 = ot;
                        if (z2) {
                            Color.rgba8888ToColor(ot.l, i31);
                            abstractC3413f9 = ot;
                        }
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        abstractC3413f11 = abstractC3413f9;
                        break;
                    case 5:
                        c5167z70.readFloat();
                        c5167z70.readFloat();
                        c5167z70.readFloat();
                        int i32 = z2 ? c5167z70.readInt() : 0;
                        l6.getClass();
                        C3436fV c3436fV = new C3436fV(strH2);
                        abstractC3413f10 = c3436fV;
                        if (z2) {
                            Color.rgba8888ToColor(c3436fV.c, i32);
                            abstractC3413f10 = c3436fV;
                        }
                        i2 = i;
                        abstractC3413f9 = abstractC3413f10;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        abstractC3413f11 = abstractC3413f9;
                        break;
                    case 6:
                        int i33 = c5167z70.readInt(z3);
                        A70 a70O4 = o(c5167z70, (b & com.umeng.analytics.pro.cw.n) != 0);
                        int i34 = z2 ? c5167z70.readInt() : 0;
                        l6.getClass();
                        C5208zf c5208zf = new C5208zf(strH2);
                        c5208zf.i = (O70) d71.c.get(i33);
                        c5208zf.g = a70O4.b;
                        c5208zf.f = (float[]) a70O4.d;
                        c5208zf.e = (int[]) a70O4.c;
                        abstractC3413f10 = c5208zf;
                        if (z2) {
                            Color.rgba8888ToColor(c5208zf.j, i34);
                            abstractC3413f10 = c5208zf;
                        }
                        i2 = i;
                        abstractC3413f9 = abstractC3413f10;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        abstractC3413f11 = abstractC3413f9;
                        break;
                    default:
                        i2 = i;
                        i3 = i15;
                        i4 = i17;
                        i18 = i18;
                        abstractC3413f11 = null;
                        break;
                }
                if (abstractC3413f11 != null) {
                    abstractC3413f11 = c3527gYC;
                    abstractC3413f11 = c4584sb;
                    i70.b(i16, strH, abstractC3413f11);
                } else {
                    abstractC3413f11 = c3527gYC;
                    abstractC3413f11 = c4584sb;
                }
                i18++;
                this = this;
                d71 = d70;
                i = i2;
                i15 = i3;
                i17 = i4;
                z3 = true;
            }
            i15++;
            d71 = d70;
            z3 = true;
        }
        return i70;
    }
}
