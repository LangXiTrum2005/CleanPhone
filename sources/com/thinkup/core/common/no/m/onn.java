package com.thinkup.core.common.no.m;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public abstract class onn {
    private static boolean n() {
        return false;
    }

    private static onn o(om0 om0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (om0Var != null) {
            Charset charsetO = om0Var.o((Charset) null);
            if (charsetO == null) {
                om0Var = om0.m(om0Var + "; charset=utf-8");
            } else {
                charset = charsetO;
            }
        }
        byte[] bytes = str.getBytes(charset);
        return o(om0Var, bytes, bytes.length);
    }

    private static boolean o0() {
        return false;
    }

    public long m() {
        return -1L;
    }

    public abstract om0 o();

    public abstract void o(com.thinkup.core.common.no.n.o0 o0Var);

    private static onn o(final om0 om0Var, final com.thinkup.core.common.no.n.om omVar) {
        return new onn() { // from class: com.thinkup.core.common.no.m.onn.1
            @Override // com.thinkup.core.common.no.m.onn
            public final long m() {
                return omVar.mm();
            }

            @Override // com.thinkup.core.common.no.m.onn
            public final om0 o() {
                return om0Var;
            }

            @Override // com.thinkup.core.common.no.m.onn
            public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
                o0Var.o0(omVar);
            }
        };
    }

    public static onn o(om0 om0Var, byte[] bArr) {
        return o(om0Var, bArr, bArr.length);
    }

    private static onn o(final om0 om0Var, final byte[] bArr, final int i2) {
        if (bArr != null) {
            com.thinkup.core.common.no.m.o.n.o(bArr.length, i2);
            return new onn() { // from class: com.thinkup.core.common.no.m.onn.2
                final /* synthetic */ int o0 = 0;

                @Override // com.thinkup.core.common.no.m.onn
                public final long m() {
                    return i2;
                }

                @Override // com.thinkup.core.common.no.m.onn
                public final om0 o() {
                    return om0Var;
                }

                @Override // com.thinkup.core.common.no.m.onn
                public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
                    o0Var.n(bArr, this.o0, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    private static onn o(final om0 om0Var, final File file) {
        if (file != null) {
            return new onn() { // from class: com.thinkup.core.common.no.m.onn.3
                @Override // com.thinkup.core.common.no.m.onn
                public final long m() {
                    return file.length();
                }

                @Override // com.thinkup.core.common.no.m.onn
                public final om0 o() {
                    return om0Var;
                }

                @Override // com.thinkup.core.common.no.m.onn
                public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
                    com.thinkup.core.common.no.n.oon oonVarO = com.thinkup.core.common.no.n.nm.o(file);
                    try {
                        o0Var.o(oonVarO);
                        if (oonVarO != null) {
                            oonVarO.close();
                        }
                    } catch (Throwable th) {
                        if (oonVarO != null) {
                            try {
                                oonVarO.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
