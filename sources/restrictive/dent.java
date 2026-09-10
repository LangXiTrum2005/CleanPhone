package restrictive;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0011\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/dern;", "colorSpace", "Lrestrictive/overspeculate;", "attabal", "(FFFFLandroidx/compose/ui/graphics/colorspace/dern;)J", "", "color", "saneness", "(I)J", "", "dern", "(J)J", "wireman", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dent {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public static final long attabal(float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.dern dernVar) {
        int i;
        int i2;
        int i3;
        float fBeachfront;
        float fMarial;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fBeachfront2;
        float fMarial2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean isSrgb = dernVar.getIsSrgb();
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (isSrgb) {
            float f6 = f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f5 = f3;
            }
            return overspeculate.competently(patroclinal.monoploid.dern(patroclinal.monoploid.dern(i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        int i23 = 0;
        if (!(dernVar.dern() == 3)) {
            coffeecake.attabal("Color only works with ColorSpaces with 3 components");
        }
        int id = dernVar.getId();
        if (!(id != -1)) {
            coffeecake.attabal("Unknown color space, please use a color space in ColorSpaces");
        }
        float fBeachfront3 = dernVar.beachfront(0);
        float fMarial3 = dernVar.marial(0);
        if (f >= fBeachfront3) {
            fBeachfront3 = f;
        }
        if (fBeachfront3 <= fMarial3) {
            fMarial3 = fBeachfront3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMarial3);
        int i24 = iFloatToRawIntBits3 >>> 31;
        int i25 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i26 = iFloatToRawIntBits3 & 8388607;
        if (i25 == 255) {
            i2 = i26 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i25 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i27 = i26 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i27) + 1) | (i24 << 15);
                    } else {
                        i2 = i27;
                    }
                    short s = (short) i3;
                    fBeachfront = dernVar.beachfront(1);
                    fMarial = dernVar.marial(1);
                    if (f2 >= fBeachfront) {
                        fBeachfront = f2;
                    }
                    if (fBeachfront <= fMarial) {
                        fMarial = fBeachfront;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMarial);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fBeachfront2 = dernVar.beachfront(2);
                                fMarial2 = dernVar.marial(2);
                                if (f3 >= fBeachfront2) {
                                    fBeachfront2 = f3;
                                }
                                if (fBeachfront2 <= fMarial2) {
                                    fMarial2 = fBeachfront2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMarial2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i23 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i23 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i23 = i15;
                                            }
                                            short s3 = (short) i18;
                                            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                f5 = f4;
                                            }
                                            return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i23 << 10);
                                short s4 = (short) i18;
                                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f5 = f4;
                                }
                                return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fBeachfront2 = dernVar.beachfront(2);
                    fMarial2 = dernVar.marial(2);
                    if (f3 >= fBeachfront2) {
                        fBeachfront2 = f3;
                    }
                    if (fBeachfront2 <= fMarial2) {
                        fMarial2 = fBeachfront2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMarial2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i23 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i23 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i23 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f5 = f4;
                                }
                                return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i23 << 10);
                    short s7 = (short) i18;
                    if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f5 = f4;
                    }
                    return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i >= -10) {
                    int i28 = (i26 | 8388608) >> (1 - i);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i2 = i28 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i24 << 15) | (i << 10);
        short s8 = (short) i3;
        fBeachfront = dernVar.beachfront(1);
        fMarial = dernVar.marial(1);
        if (f2 >= fBeachfront) {
            fBeachfront = f2;
        }
        if (fBeachfront <= fMarial) {
            fMarial = fBeachfront;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMarial);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fBeachfront2 = dernVar.beachfront(2);
                    fMarial2 = dernVar.marial(2);
                    if (f3 >= fBeachfront2) {
                        fBeachfront2 = f3;
                    }
                    if (fBeachfront2 <= fMarial2) {
                        fMarial2 = fBeachfront2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMarial2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i23 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i23 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i23 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f5 = f4;
                                }
                                return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i23 << 10);
                    short s11 = (short) i18;
                    if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f5 = f4;
                    }
                    return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fBeachfront2 = dernVar.beachfront(2);
        fMarial2 = dernVar.marial(2);
        if (f3 >= fBeachfront2) {
            fBeachfront2 = f3;
        }
        if (fBeachfront2 <= fMarial2) {
            fMarial2 = fBeachfront2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMarial2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i23 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i23 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i23 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f5 = f4;
                    }
                    return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i23 << 10);
        short s14 = (short) i18;
        if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = f4;
        }
        return overspeculate.competently(patroclinal.monoploid.dern((((long) id) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    public static final long dern(long j) {
        return overspeculate.competently(patroclinal.monoploid.dern(j << 32));
    }

    public static final long saneness(int i) {
        return overspeculate.competently(patroclinal.monoploid.dern(patroclinal.monoploid.dern(i) << 32));
    }

    public static final int wireman(long j) {
        return (int) patroclinal.monoploid.dern(overspeculate.impromptu(j, androidx.compose.ui.graphics.colorspace.competently.f6507attabal.impromptu()) >>> 32);
    }
}
