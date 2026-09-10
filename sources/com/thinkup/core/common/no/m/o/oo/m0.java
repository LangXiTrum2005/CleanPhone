package com.thinkup.core.common.no.m.o.oo;

import com.inmobi.commons.core.configs.AdConfig;
import com.thinkup.core.common.no.n.om0;
import com.thinkup.core.common.no.n.oon;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
final class m0 implements Closeable {
    static final Logger o = Logger.getLogger(oo.class.getName());
    final o0.o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.n.oo f42046n;
    private final o o0;
    private final boolean oo;

    public interface m {
        void m();

        void o();

        void o(int i2, long j);

        void o(int i2, com.thinkup.core.common.no.m.o.oo.m mVar);

        void o(int i2, com.thinkup.core.common.no.n.om omVar);

        void o(int i2, List<n> list);

        void o(no noVar);

        void o(boolean z2, int i2, int i3);

        void o(boolean z2, int i2, com.thinkup.core.common.no.n.oo ooVar, int i3);

        void o(boolean z2, int i2, List<n> list);

        void o0();
    }

    public static final class o implements oon {
        byte m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42047n;
        int o;
        int o0;
        private final com.thinkup.core.common.no.n.oo om;
        short oo;

        public o(com.thinkup.core.common.no.n.oo ooVar) {
            this.om = ooVar;
        }

        private void m() throws IOException {
            int i2 = this.f42047n;
            int iO = m0.o(this.om);
            this.o0 = iO;
            this.o = iO;
            byte bMn = (byte) (this.om.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.m = (byte) (this.om.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            Logger logger = m0.o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(oo.o(true, this.f42047n, this.o, bMn, this.m));
            }
            int iNo = this.om.no() & Integer.MAX_VALUE;
            this.f42047n = iNo;
            if (bMn != 9) {
                throw oo.m("%s != TYPE_CONTINUATION", Byte.valueOf(bMn));
            }
            if (iNo != i2) {
                throw oo.m("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            int i2;
            int iNo;
            do {
                int i3 = this.o0;
                if (i3 != 0) {
                    long jA_ = this.om.a_(nVar, Math.min(j, i3));
                    if (jA_ == -1) {
                        return -1L;
                    }
                    this.o0 = (int) (((long) this.o0) - jA_);
                    return jA_;
                }
                this.om.mo(this.oo);
                this.oo = (short) 0;
                if ((this.m & 4) != 0) {
                    return -1L;
                }
                i2 = this.f42047n;
                int iO = m0.o(this.om);
                this.o0 = iO;
                this.o = iO;
                byte bMn = (byte) (this.om.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                this.m = (byte) (this.om.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                Logger logger = m0.o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(oo.o(true, this.f42047n, this.o, bMn, this.m));
                }
                iNo = this.om.no() & Integer.MAX_VALUE;
                this.f42047n = iNo;
                if (bMn != 9) {
                    throw oo.m("%s != TYPE_CONTINUATION", Byte.valueOf(bMn));
                }
            } while (iNo == i2);
            throw oo.m("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final om0 o() {
            return this.om.o();
        }
    }

    public m0(com.thinkup.core.common.no.n.oo ooVar, boolean z2) {
        this.f42046n = ooVar;
        this.oo = z2;
        o oVar = new o(ooVar);
        this.o0 = oVar;
        this.m = new o0.o(oVar, (byte) 0);
    }

    private void m(m mVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            throw oo.m("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z2 = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw oo.m("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short sMn = (b2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
        mVar.o(z2, i3, this.f42046n, o(i2, b2, sMn));
        this.f42046n.mo(sMn);
    }

    private void n(m mVar, int i2, byte b2, int i3) throws IOException {
        if (i3 != 0) {
            throw oo.m("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i2 != 0) {
                throw oo.m("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            return;
        }
        if (i2 % 6 != 0) {
            throw oo.m("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
        }
        no noVar = new no();
        for (int i4 = 0; i4 < i2; i4 += 6) {
            int iN0 = this.f42046n.n0() & 65535;
            int iNo = this.f42046n.no();
            if (iN0 == 2) {
                if (iNo != 0 && iNo != 1) {
                    throw oo.m("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (iN0 == 3) {
                iN0 = 4;
            } else if (iN0 != 4) {
                if (iN0 == 5 && (iNo < 16384 || iNo > 16777215)) {
                    throw oo.m("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iNo));
                }
            } else {
                if (iNo < 0) {
                    throw oo.m("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                iN0 = 7;
            }
            noVar.o(iN0, iNo);
        }
        mVar.o(noVar);
    }

    private void o0(m mVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            throw oo.m("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short sMn = (b2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
        mVar.o(this.f42046n.no() & Integer.MAX_VALUE, o(o(i2 - 4, b2, sMn), sMn, b2, i3));
    }

    private void oo(m mVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 8) {
            throw oo.m("TYPE_PING length != 8: %s", Integer.valueOf(i2));
        }
        if (i3 != 0) {
            throw oo.m("TYPE_PING streamId != 0", new Object[0]);
        }
        mVar.o((b2 & 1) != 0, this.f42046n.no(), this.f42046n.no());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42046n.close();
    }

    public final void o(m mVar) throws IOException {
        if (this.oo) {
            if (!o(true, mVar)) {
                throw oo.m("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        com.thinkup.core.common.no.n.oo ooVar = this.f42046n;
        com.thinkup.core.common.no.n.om omVar = oo.o;
        com.thinkup.core.common.no.n.om omVarO0 = ooVar.o0(omVar.mm());
        Logger logger = o;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(com.thinkup.core.common.no.m.o.n.o("<< CONNECTION %s", omVarO0.on()));
        }
        if (!omVar.equals(omVarO0)) {
            throw oo.m("Expected a connection header but was %s", omVarO0.o());
        }
    }

    private void m(m mVar, int i2, int i3) throws IOException {
        if (i2 < 8) {
            throw oo.m("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
        }
        if (i3 == 0) {
            int iNo = this.f42046n.no();
            int iNo2 = this.f42046n.no();
            int i4 = i2 - 8;
            if (com.thinkup.core.common.no.m.o.oo.m.o(iNo2) != null) {
                com.thinkup.core.common.no.n.om omVarO0 = com.thinkup.core.common.no.n.om.m;
                if (i4 > 0) {
                    omVarO0 = this.f42046n.o0(i4);
                }
                mVar.o(iNo, omVarO0);
                return;
            }
            throw oo.m("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iNo2));
        }
        throw oo.m("TYPE_GOAWAY streamId != 0", new Object[0]);
    }

    public final boolean o(boolean z2, m mVar) throws IOException {
        try {
            this.f42046n.o(9L);
            int iO = o(this.f42046n);
            if (iO >= 0 && iO <= 16384) {
                byte bMn = (byte) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (z2 && bMn != 4) {
                    throw oo.m("Expected a SETTINGS frame but was %s", Byte.valueOf(bMn));
                }
                byte bMn2 = (byte) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                int iNo = this.f42046n.no() & Integer.MAX_VALUE;
                Logger logger = o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(oo.o(true, iNo, iO, bMn, bMn2));
                }
                switch (bMn) {
                    case 0:
                        if (iNo == 0) {
                            throw oo.m("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        }
                        boolean z3 = (bMn2 & 1) != 0;
                        if ((bMn2 & 32) == 0) {
                            short sMn = (bMn2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                            mVar.o(z3, iNo, this.f42046n, o(iO, bMn2, sMn));
                            this.f42046n.mo(sMn);
                            return true;
                        }
                        throw oo.m("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    case 1:
                        if (iNo != 0) {
                            boolean z4 = (bMn2 & 1) != 0;
                            short sMn2 = (bMn2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                            if ((bMn2 & 32) != 0) {
                                o();
                                iO -= 5;
                            }
                            mVar.o(z4, iNo, o(o(iO, bMn2, sMn2), sMn2, bMn2, iNo));
                            return true;
                        }
                        throw oo.m("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    case 2:
                        if (iO != 5) {
                            throw oo.m("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iO));
                        }
                        if (iNo != 0) {
                            o();
                            return true;
                        }
                        throw oo.m("TYPE_PRIORITY streamId == 0", new Object[0]);
                    case 3:
                        if (iO != 4) {
                            throw oo.m("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iO));
                        }
                        if (iNo != 0) {
                            int iNo2 = this.f42046n.no();
                            com.thinkup.core.common.no.m.o.oo.m mVarO = com.thinkup.core.common.no.m.o.oo.m.o(iNo2);
                            if (mVarO != null) {
                                mVar.o(iNo, mVarO);
                                return true;
                            }
                            throw oo.m("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iNo2));
                        }
                        throw oo.m("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    case 4:
                        if (iNo != 0) {
                            throw oo.m("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((bMn2 & 1) != 0) {
                            if (iO != 0) {
                                throw oo.m("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (iO % 6 == 0) {
                            no noVar = new no();
                            for (int i2 = 0; i2 < iO; i2 += 6) {
                                int iN0 = this.f42046n.n0() & 65535;
                                int iNo3 = this.f42046n.no();
                                if (iN0 == 2) {
                                    if (iNo3 != 0 && iNo3 != 1) {
                                        throw oo.m("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                } else if (iN0 == 3) {
                                    iN0 = 4;
                                } else if (iN0 != 4) {
                                    if (iN0 == 5 && (iNo3 < 16384 || iNo3 > 16777215)) {
                                        throw oo.m("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iNo3));
                                    }
                                } else {
                                    if (iNo3 < 0) {
                                        throw oo.m("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    iN0 = 7;
                                }
                                noVar.o(iN0, iNo3);
                            }
                            mVar.o(noVar);
                        } else {
                            throw oo.m("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iO));
                        }
                        return true;
                    case 5:
                        if (iNo != 0) {
                            short sMn3 = (bMn2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
                            mVar.o(this.f42046n.no() & Integer.MAX_VALUE, o(o(iO - 4, bMn2, sMn3), sMn3, bMn2, iNo));
                            return true;
                        }
                        throw oo.m("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    case 6:
                        if (iO != 8) {
                            throw oo.m("TYPE_PING length != 8: %s", Integer.valueOf(iO));
                        }
                        if (iNo == 0) {
                            mVar.o((bMn2 & 1) != 0, this.f42046n.no(), this.f42046n.no());
                            return true;
                        }
                        throw oo.m("TYPE_PING streamId != 0", new Object[0]);
                    case 7:
                        if (iO < 8) {
                            throw oo.m("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iO));
                        }
                        if (iNo == 0) {
                            int iNo4 = this.f42046n.no();
                            int iNo5 = this.f42046n.no();
                            int i3 = iO - 8;
                            if (com.thinkup.core.common.no.m.o.oo.m.o(iNo5) != null) {
                                com.thinkup.core.common.no.n.om omVarO0 = com.thinkup.core.common.no.n.om.m;
                                if (i3 > 0) {
                                    omVarO0 = this.f42046n.o0(i3);
                                }
                                mVar.o(iNo4, omVarO0);
                                return true;
                            }
                            throw oo.m("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iNo5));
                        }
                        throw oo.m("TYPE_GOAWAY streamId != 0", new Object[0]);
                    case 8:
                        if (iO == 4) {
                            long jNo = ((long) this.f42046n.no()) & 2147483647L;
                            if (jNo != 0) {
                                mVar.o(iNo, jNo);
                                return true;
                            }
                            throw oo.m("windowSizeIncrement was 0", Long.valueOf(jNo));
                        }
                        throw oo.m("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iO));
                    default:
                        this.f42046n.mo(iO);
                        return true;
                }
            }
            throw oo.m("FRAME_SIZE_ERROR: %s", Integer.valueOf(iO));
        } catch (EOFException unused) {
            return false;
        }
    }

    private void n(m mVar, int i2, int i3) throws IOException {
        if (i2 == 4) {
            long jNo = ((long) this.f42046n.no()) & 2147483647L;
            if (jNo != 0) {
                mVar.o(i3, jNo);
                return;
            }
            throw oo.m("windowSizeIncrement was 0", Long.valueOf(jNo));
        }
        throw oo.m("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
    }

    private void o(m mVar, int i2, byte b2, int i3) throws IOException {
        if (i3 != 0) {
            boolean z2 = (b2 & 1) != 0;
            short sMn = (b2 & 8) != 0 ? (short) (this.f42046n.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
            if ((b2 & 32) != 0) {
                o();
                i2 -= 5;
            }
            mVar.o(z2, i3, o(o(i2, b2, sMn), sMn, b2, i3));
            return;
        }
        throw oo.m("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    private List<n> o(int i2, short s, byte b2, int i3) throws IOException {
        o oVar = this.o0;
        oVar.o0 = i2;
        oVar.o = i2;
        oVar.oo = s;
        oVar.m = b2;
        oVar.f42047n = i3;
        this.m.o();
        return this.m.m();
    }

    private void o(int i2, int i3) throws IOException {
        if (i2 != 5) {
            throw oo.m("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
        }
        if (i3 != 0) {
            o();
            return;
        }
        throw oo.m("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void o() {
        this.f42046n.no();
        this.f42046n.mn();
    }

    private void o(m mVar, int i2, int i3) throws IOException {
        if (i2 != 4) {
            throw oo.m("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
        }
        if (i3 != 0) {
            int iNo = this.f42046n.no();
            com.thinkup.core.common.no.m.o.oo.m mVarO = com.thinkup.core.common.no.m.o.oo.m.o(iNo);
            if (mVarO != null) {
                mVar.o(i3, mVarO);
                return;
            }
            throw oo.m("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iNo));
        }
        throw oo.m("TYPE_RST_STREAM streamId == 0", new Object[0]);
    }

    public static int o(com.thinkup.core.common.no.n.oo ooVar) {
        return (ooVar.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((ooVar.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((ooVar.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    private static int o(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw oo.m("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }
}
