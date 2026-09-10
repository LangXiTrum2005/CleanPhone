package com.badlogic.gdx.utils.compression.lzma;

import android.support.v4.media.session.PlaybackStateCompat;
import com.badlogic.gdx.utils.compression.ICodeProgress;
import com.badlogic.gdx.utils.compression.lz.BinTree;
import com.badlogic.gdx.utils.compression.rangecoder.BitTreeEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Encoder {
    public static final int EMatchFinderTypeBT2 = 0;
    public static final int EMatchFinderTypeBT4 = 1;
    static byte[] g_FastPos = null;
    static final int kDefaultDictionaryLogSize = 22;
    static final int kIfinityPrice = 268435455;
    static final int kNumFastBytesDefault = 32;
    public static final int kNumLenSpecSymbols = 16;
    static final int kNumOpts = 4096;
    public static final int kPropSize = 5;
    int _additionalOffset;
    int _alignPriceCount;
    boolean _finished;
    InputStream _inStream;
    int _longestMatchLength;
    boolean _longestMatchWasFound;
    int _matchPriceCount;
    int _numDistancePairs;
    int _optimumCurrentIndex;
    int _optimumEndIndex;
    byte _previousByte;
    int backRes;
    long nowPos64;
    int _state = Base.StateInit();
    int[] _repDistances = new int[4];
    Optimal[] _optimum = new Optimal[4096];
    BinTree _matchFinder = null;
    com.badlogic.gdx.utils.compression.rangecoder.Encoder _rangeEncoder = new com.badlogic.gdx.utils.compression.rangecoder.Encoder();
    short[] _isMatch = new short[192];
    short[] _isRep = new short[12];
    short[] _isRepG0 = new short[12];
    short[] _isRepG1 = new short[12];
    short[] _isRepG2 = new short[12];
    short[] _isRep0Long = new short[192];
    BitTreeEncoder[] _posSlotEncoder = new BitTreeEncoder[4];
    short[] _posEncoders = new short[114];
    BitTreeEncoder _posAlignEncoder = new BitTreeEncoder(4);
    LenPriceTableEncoder _lenEncoder = new LenPriceTableEncoder();
    LenPriceTableEncoder _repMatchLenEncoder = new LenPriceTableEncoder();
    LiteralEncoder _literalEncoder = new LiteralEncoder();
    int[] _matchDistances = new int[548];
    int _numFastBytes = 32;
    int[] _posSlotPrices = new int[256];
    int[] _distancesPrices = new int[512];
    int[] _alignPrices = new int[16];
    int _distTableSize = 44;
    int _posStateBits = 2;
    int _posStateMask = 3;
    int _numLiteralPosStateBits = 0;
    int _numLiteralContextBits = 3;
    int _dictionarySize = 4194304;
    int _dictionarySizePrev = -1;
    int _numFastBytesPrev = -1;
    int _matchFinderType = 1;
    boolean _writeEndMark = false;
    boolean _needReleaseMFStream = false;
    int[] reps = new int[4];
    int[] repLens = new int[4];
    long[] processedInSize = new long[1];
    long[] processedOutSize = new long[1];
    boolean[] finished = new boolean[1];
    byte[] properties = new byte[5];
    int[] tempPrices = new int[128];

    public class LenEncoder {
        short[] _choice = new short[2];
        BitTreeEncoder[] _lowCoder = new BitTreeEncoder[16];
        BitTreeEncoder[] _midCoder = new BitTreeEncoder[16];
        BitTreeEncoder _highCoder = new BitTreeEncoder(8);

        public LenEncoder() {
            for (int i = 0; i < 16; i++) {
                this._lowCoder[i] = new BitTreeEncoder(3);
                this._midCoder[i] = new BitTreeEncoder(3);
            }
        }

        public void Encode(com.badlogic.gdx.utils.compression.rangecoder.Encoder encoder, int i, int i2) throws IOException {
            if (i < 8) {
                encoder.Encode(this._choice, 0, 0);
                this._lowCoder[i2].Encode(encoder, i);
                return;
            }
            int i3 = i - 8;
            encoder.Encode(this._choice, 0, 1);
            if (i3 < 8) {
                encoder.Encode(this._choice, 1, 0);
                this._midCoder[i2].Encode(encoder, i3);
            } else {
                encoder.Encode(this._choice, 1, 1);
                this._highCoder.Encode(encoder, i - 16);
            }
        }

        public void Init(int i) {
            com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._choice);
            for (int i2 = 0; i2 < i; i2++) {
                this._lowCoder[i2].Init();
                this._midCoder[i2].Init();
            }
            this._highCoder.Init();
        }

        public void SetPrices(int i, int i2, int[] iArr, int i3) {
            int i4 = 0;
            int iGetPrice0 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._choice[0]);
            int iGetPrice1 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._choice[0]);
            int iGetPrice2 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._choice[1]) + iGetPrice1;
            int iGetPrice3 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._choice[1]) + iGetPrice1;
            while (i4 < 8) {
                if (i4 >= i2) {
                    return;
                }
                iArr[i3 + i4] = this._lowCoder[i].GetPrice(i4) + iGetPrice0;
                i4++;
            }
            while (i4 < 16) {
                if (i4 >= i2) {
                    return;
                }
                iArr[i3 + i4] = this._midCoder[i].GetPrice(i4 - 8) + iGetPrice2;
                i4++;
            }
            while (i4 < i2) {
                iArr[i3 + i4] = this._highCoder.GetPrice(i4 - 16) + iGetPrice3;
                i4++;
            }
        }
    }

    public class LenPriceTableEncoder extends LenEncoder {
        int[] _counters;
        int[] _prices;
        int _tableSize;

        public LenPriceTableEncoder() {
            super();
            this._prices = new int[4352];
            this._counters = new int[16];
        }

        @Override // com.badlogic.gdx.utils.compression.lzma.Encoder.LenEncoder
        public void Encode(com.badlogic.gdx.utils.compression.rangecoder.Encoder encoder, int i, int i2) throws IOException {
            super.Encode(encoder, i, i2);
            int[] iArr = this._counters;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 == 0) {
                UpdateTable(i2);
            }
        }

        public int GetPrice(int i, int i2) {
            return this._prices[(i2 * Base.kNumLenSymbols) + i];
        }

        public void SetTableSize(int i) {
            this._tableSize = i;
        }

        public void UpdateTable(int i) {
            SetPrices(i, this._tableSize, this._prices, i * Base.kNumLenSymbols);
            this._counters[i] = this._tableSize;
        }

        public void UpdateTables(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                UpdateTable(i2);
            }
        }
    }

    public class LiteralEncoder {
        Encoder2[] m_Coders;
        int m_NumPosBits;
        int m_NumPrevBits;
        int m_PosMask;

        public class Encoder2 {
            short[] m_Encoders = new short[768];

            public Encoder2() {
            }

            public void Encode(com.badlogic.gdx.utils.compression.rangecoder.Encoder encoder, byte b) throws IOException {
                int i = 1;
                for (int i2 = 7; i2 >= 0; i2--) {
                    int i3 = (b >> i2) & 1;
                    encoder.Encode(this.m_Encoders, i, i3);
                    i = (i << 1) | i3;
                }
            }

            public void EncodeMatched(com.badlogic.gdx.utils.compression.rangecoder.Encoder encoder, byte b, byte b2) throws IOException {
                int i;
                int i2 = 1;
                boolean z = true;
                for (int i3 = 7; i3 >= 0; i3--) {
                    int i4 = (b2 >> i3) & 1;
                    if (z) {
                        int i5 = (b >> i3) & 1;
                        i = ((i5 + 1) << 8) + i2;
                        z = i5 == i4;
                    } else {
                        i = i2;
                    }
                    encoder.Encode(this.m_Encoders, i, i4);
                    i2 = (i2 << 1) | i4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x002a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002a -> B:8:0x0021). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public int GetPrice(boolean r8, byte r9, byte r10) {
                /*
                    r7 = this;
                    r0 = 0
                    r1 = 1
                    r2 = 7
                    if (r8 == 0) goto L27
                    r8 = 1
                L6:
                    if (r2 < 0) goto L28
                    int r3 = r9 >> r2
                    r3 = r3 & r1
                    int r4 = r10 >> r2
                    r4 = r4 & r1
                    short[] r5 = r7.m_Encoders
                    int r6 = r3 + 1
                    int r6 = r6 << 8
                    int r6 = r6 + r8
                    short r5 = r5[r6]
                    int r5 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice(r5, r4)
                    int r0 = r0 + r5
                    int r8 = r8 << 1
                    r8 = r8 | r4
                    if (r3 == r4) goto L24
                L21:
                    int r2 = r2 + (-1)
                    goto L28
                L24:
                    int r2 = r2 + (-1)
                    goto L6
                L27:
                    r8 = 1
                L28:
                    if (r2 < 0) goto L39
                    int r9 = r10 >> r2
                    r9 = r9 & r1
                    short[] r3 = r7.m_Encoders
                    short r3 = r3[r8]
                    int r3 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice(r3, r9)
                    int r0 = r0 + r3
                    int r8 = r8 << r1
                    r8 = r8 | r9
                    goto L21
                L39:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.compression.lzma.Encoder.LiteralEncoder.Encoder2.GetPrice(boolean, byte, byte):int");
            }

            public void Init() {
                com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this.m_Encoders);
            }
        }

        public LiteralEncoder() {
        }

        public void Create(int i, int i2) {
            if (this.m_Coders != null && this.m_NumPrevBits == i2 && this.m_NumPosBits == i) {
                return;
            }
            this.m_NumPosBits = i;
            this.m_PosMask = (1 << i) - 1;
            this.m_NumPrevBits = i2;
            int i3 = 1 << (i2 + i);
            this.m_Coders = new Encoder2[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                this.m_Coders[i4] = new Encoder2();
            }
        }

        public Encoder2 GetSubCoder(int i, byte b) {
            Encoder2[] encoder2Arr = this.m_Coders;
            int i2 = i & this.m_PosMask;
            int i3 = this.m_NumPrevBits;
            return encoder2Arr[(i2 << i3) + ((b & 255) >>> (8 - i3))];
        }

        public void Init() {
            int i = 1 << (this.m_NumPrevBits + this.m_NumPosBits);
            for (int i2 = 0; i2 < i; i2++) {
                this.m_Coders[i2].Init();
            }
        }
    }

    public class Optimal {
        public int BackPrev;
        public int BackPrev2;
        public int Backs0;
        public int Backs1;
        public int Backs2;
        public int Backs3;
        public int PosPrev;
        public int PosPrev2;
        public boolean Prev1IsChar;
        public boolean Prev2;
        public int Price;
        public int State;

        public Optimal() {
        }

        public boolean IsShortRep() {
            return this.BackPrev == 0;
        }

        public void MakeAsChar() {
            this.BackPrev = -1;
            this.Prev1IsChar = false;
        }

        public void MakeAsShortRep() {
            this.BackPrev = 0;
            this.Prev1IsChar = false;
        }
    }

    static {
        byte[] bArr = new byte[2048];
        g_FastPos = bArr;
        bArr[0] = 0;
        bArr[1] = 1;
        int i = 2;
        for (int i2 = 2; i2 < 22; i2++) {
            int i3 = 1 << ((i2 >> 1) - 1);
            int i4 = 0;
            while (i4 < i3) {
                g_FastPos[i] = (byte) i2;
                i4++;
                i++;
            }
        }
    }

    public Encoder() {
        for (int i = 0; i < 4096; i++) {
            this._optimum[i] = new Optimal();
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this._posSlotEncoder[i2] = new BitTreeEncoder(6);
        }
    }

    public static int GetPosSlot(int i) {
        if (i < 2048) {
            return g_FastPos[i];
        }
        return i < 2097152 ? g_FastPos[i >> 10] + 20 : g_FastPos[i >> 20] + 40;
    }

    public static int GetPosSlot2(int i) {
        if (i < 131072) {
            return g_FastPos[i >> 6] + 12;
        }
        return i < 134217728 ? g_FastPos[i >> 16] + 32 : g_FastPos[i >> 26] + 52;
    }

    public int Backward(int i) {
        this._optimumEndIndex = i;
        Optimal optimal = this._optimum[i];
        int i2 = optimal.PosPrev;
        int i3 = optimal.BackPrev;
        while (true) {
            Optimal[] optimalArr = this._optimum;
            if (optimalArr[i].Prev1IsChar) {
                optimalArr[i2].MakeAsChar();
                Optimal[] optimalArr2 = this._optimum;
                int i4 = i2 - 1;
                optimalArr2[i2].PosPrev = i4;
                Optimal optimal2 = optimalArr2[i];
                if (optimal2.Prev2) {
                    Optimal optimal3 = optimalArr2[i4];
                    optimal3.Prev1IsChar = false;
                    optimal3.PosPrev = optimal2.PosPrev2;
                    optimal3.BackPrev = optimal2.BackPrev2;
                }
            }
            Optimal[] optimalArr3 = this._optimum;
            Optimal optimal4 = optimalArr3[i2];
            int i5 = optimal4.BackPrev;
            int i6 = optimal4.PosPrev;
            optimal4.BackPrev = i3;
            optimal4.PosPrev = i;
            if (i2 <= 0) {
                Optimal optimal5 = optimalArr3[0];
                this.backRes = optimal5.BackPrev;
                int i7 = optimal5.PosPrev;
                this._optimumCurrentIndex = i7;
                return i7;
            }
            i = i2;
            i3 = i5;
            i2 = i6;
        }
    }

    public void BaseInit() {
        this._state = Base.StateInit();
        this._previousByte = (byte) 0;
        for (int i = 0; i < 4; i++) {
            this._repDistances[i] = 0;
        }
    }

    public boolean ChangePair(int i, int i2) {
        return i < 33554432 && i2 >= (i << 7);
    }

    public void Code(InputStream inputStream, OutputStream outputStream, long j, long j2, ICodeProgress iCodeProgress) throws IOException {
        this._needReleaseMFStream = false;
        try {
            SetStreams(inputStream, outputStream, j, j2);
            while (true) {
                CodeOneBlock(this.processedInSize, this.processedOutSize, this.finished);
                if (this.finished[0]) {
                    ReleaseStreams();
                    return;
                } else if (iCodeProgress != null) {
                    iCodeProgress.SetProgress(this.processedInSize[0], this.processedOutSize[0]);
                }
            }
        } catch (Throwable th) {
            ReleaseStreams();
            throw th;
        }
    }

    public void CodeOneBlock(long[] jArr, long[] jArr2, boolean[] zArr) throws IOException {
        jArr[0] = 0;
        jArr2[0] = 0;
        zArr[0] = true;
        InputStream inputStream = this._inStream;
        if (inputStream != null) {
            this._matchFinder.SetStream(inputStream);
            this._matchFinder.Init();
            this._needReleaseMFStream = true;
            this._inStream = null;
        }
        if (this._finished) {
            return;
        }
        this._finished = true;
        long j = this.nowPos64;
        if (j == 0) {
            if (this._matchFinder.GetNumAvailableBytes() == 0) {
                Flush((int) this.nowPos64);
                return;
            }
            ReadMatchDistances();
            this._rangeEncoder.Encode(this._isMatch, (this._state << 4) + (this._posStateMask & ((int) this.nowPos64)), 0);
            this._state = Base.StateUpdateChar(this._state);
            byte bGetIndexByte = this._matchFinder.GetIndexByte(0 - this._additionalOffset);
            this._literalEncoder.GetSubCoder((int) this.nowPos64, this._previousByte).Encode(this._rangeEncoder, bGetIndexByte);
            this._previousByte = bGetIndexByte;
            this._additionalOffset--;
            this.nowPos64++;
        }
        if (this._matchFinder.GetNumAvailableBytes() == 0) {
            Flush((int) this.nowPos64);
            return;
        }
        while (true) {
            int iGetOptimum = GetOptimum((int) this.nowPos64);
            int i = this.backRes;
            int i2 = this._posStateMask & ((int) this.nowPos64);
            int i3 = (this._state << 4) + i2;
            if (iGetOptimum == 1 && i == -1) {
                this._rangeEncoder.Encode(this._isMatch, i3, 0);
                byte bGetIndexByte2 = this._matchFinder.GetIndexByte(0 - this._additionalOffset);
                LiteralEncoder.Encoder2 encoder2GetSubCoder = this._literalEncoder.GetSubCoder((int) this.nowPos64, this._previousByte);
                if (Base.StateIsCharState(this._state)) {
                    encoder2GetSubCoder.Encode(this._rangeEncoder, bGetIndexByte2);
                } else {
                    encoder2GetSubCoder.EncodeMatched(this._rangeEncoder, this._matchFinder.GetIndexByte(((-1) - this._repDistances[0]) - this._additionalOffset), bGetIndexByte2);
                }
                this._previousByte = bGetIndexByte2;
                this._state = Base.StateUpdateChar(this._state);
            } else {
                this._rangeEncoder.Encode(this._isMatch, i3, 1);
                if (i < 4) {
                    this._rangeEncoder.Encode(this._isRep, this._state, 1);
                    if (i == 0) {
                        this._rangeEncoder.Encode(this._isRepG0, this._state, 0);
                        if (iGetOptimum == 1) {
                            this._rangeEncoder.Encode(this._isRep0Long, i3, 0);
                        } else {
                            this._rangeEncoder.Encode(this._isRep0Long, i3, 1);
                        }
                    } else {
                        this._rangeEncoder.Encode(this._isRepG0, this._state, 1);
                        if (i == 1) {
                            this._rangeEncoder.Encode(this._isRepG1, this._state, 0);
                        } else {
                            this._rangeEncoder.Encode(this._isRepG1, this._state, 1);
                            this._rangeEncoder.Encode(this._isRepG2, this._state, i - 2);
                        }
                    }
                    if (iGetOptimum == 1) {
                        this._state = Base.StateUpdateShortRep(this._state);
                    } else {
                        this._repMatchLenEncoder.Encode(this._rangeEncoder, iGetOptimum - 2, i2);
                        this._state = Base.StateUpdateRep(this._state);
                    }
                    int i4 = this._repDistances[i];
                    if (i != 0) {
                        while (i >= 1) {
                            int[] iArr = this._repDistances;
                            iArr[i] = iArr[i - 1];
                            i--;
                        }
                        this._repDistances[0] = i4;
                    }
                } else {
                    this._rangeEncoder.Encode(this._isRep, this._state, 0);
                    this._state = Base.StateUpdateMatch(this._state);
                    this._lenEncoder.Encode(this._rangeEncoder, iGetOptimum - 2, i2);
                    int i5 = i - 4;
                    int iGetPosSlot = GetPosSlot(i5);
                    this._posSlotEncoder[Base.GetLenToPosState(iGetOptimum)].Encode(this._rangeEncoder, iGetPosSlot);
                    if (iGetPosSlot >= 4) {
                        int i6 = iGetPosSlot >> 1;
                        int i7 = i6 - 1;
                        int i8 = ((iGetPosSlot & 1) | 2) << i7;
                        int i9 = i5 - i8;
                        if (iGetPosSlot < 14) {
                            BitTreeEncoder.ReverseEncode(this._posEncoders, (i8 - iGetPosSlot) - 1, this._rangeEncoder, i7, i9);
                        } else {
                            this._rangeEncoder.EncodeDirectBits(i9 >> 4, i6 - 5);
                            this._posAlignEncoder.ReverseEncode(this._rangeEncoder, i9 & 15);
                            this._alignPriceCount++;
                        }
                    }
                    for (int i10 = 3; i10 >= 1; i10--) {
                        int[] iArr2 = this._repDistances;
                        iArr2[i10] = iArr2[i10 - 1];
                    }
                    this._repDistances[0] = i5;
                    this._matchPriceCount++;
                }
                this._previousByte = this._matchFinder.GetIndexByte((iGetOptimum - 1) - this._additionalOffset);
            }
            int i11 = this._additionalOffset - iGetOptimum;
            this._additionalOffset = i11;
            this.nowPos64 += (long) iGetOptimum;
            if (i11 == 0) {
                if (this._matchPriceCount >= 128) {
                    FillDistancesPrices();
                }
                if (this._alignPriceCount >= 16) {
                    FillAlignPrices();
                }
                jArr[0] = this.nowPos64;
                jArr2[0] = this._rangeEncoder.GetProcessedSizeAdd();
                if (this._matchFinder.GetNumAvailableBytes() == 0) {
                    Flush((int) this.nowPos64);
                    return;
                } else if (this.nowPos64 - j >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                    this._finished = false;
                    zArr[0] = false;
                    return;
                }
            }
        }
    }

    public void Create() {
        if (this._matchFinder == null) {
            BinTree binTree = new BinTree();
            binTree.SetType(this._matchFinderType == 0 ? 2 : 4);
            this._matchFinder = binTree;
        }
        this._literalEncoder.Create(this._numLiteralPosStateBits, this._numLiteralContextBits);
        int i = this._dictionarySize;
        if (i == this._dictionarySizePrev && this._numFastBytesPrev == this._numFastBytes) {
            return;
        }
        this._matchFinder.Create(i, 4096, this._numFastBytes, 274);
        this._dictionarySizePrev = this._dictionarySize;
        this._numFastBytesPrev = this._numFastBytes;
    }

    public void FillAlignPrices() {
        for (int i = 0; i < 16; i++) {
            this._alignPrices[i] = this._posAlignEncoder.ReverseGetPrice(i);
        }
        this._alignPriceCount = 0;
    }

    public void FillDistancesPrices() {
        for (int i = 4; i < 128; i++) {
            int iGetPosSlot = GetPosSlot(i);
            int i2 = (iGetPosSlot >> 1) - 1;
            int i3 = ((iGetPosSlot & 1) | 2) << i2;
            this.tempPrices[i] = BitTreeEncoder.ReverseGetPrice(this._posEncoders, (i3 - iGetPosSlot) - 1, i2, i - i3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            BitTreeEncoder bitTreeEncoder = this._posSlotEncoder[i4];
            int i5 = i4 << 6;
            for (int i6 = 0; i6 < this._distTableSize; i6++) {
                this._posSlotPrices[i5 + i6] = bitTreeEncoder.GetPrice(i6);
            }
            for (int i7 = 14; i7 < this._distTableSize; i7++) {
                int[] iArr = this._posSlotPrices;
                int i8 = i5 + i7;
                iArr[i8] = iArr[i8] + (((i7 >> 1) - 5) << 6);
            }
            int i9 = i4 * 128;
            int i10 = 0;
            while (i10 < 4) {
                this._distancesPrices[i9 + i10] = this._posSlotPrices[i5 + i10];
                i10++;
            }
            while (i10 < 128) {
                this._distancesPrices[i9 + i10] = this._posSlotPrices[GetPosSlot(i10) + i5] + this.tempPrices[i10];
                i10++;
            }
        }
        this._matchPriceCount = 0;
    }

    public void Flush(int i) throws IOException {
        ReleaseMFStream();
        WriteEndMarker(i & this._posStateMask);
        this._rangeEncoder.FlushData();
        this._rangeEncoder.FlushStream();
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0404  */
    /* JADX WARN: Code duplicated, block: B:166:0x0412  */
    /* JADX WARN: Code duplicated, block: B:167:0x041a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0439  */
    /* JADX WARN: Code duplicated, block: B:177:0x0449  */
    /* JADX WARN: Code duplicated, block: B:179:0x044d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0463  */
    /* JADX WARN: Code duplicated, block: B:184:0x04d9 A[LOOP:10: B:182:0x04d5->B:184:0x04d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:190:0x0508  */
    /* JADX WARN: Code duplicated, block: B:192:0x0520  */
    /* JADX WARN: Code duplicated, block: B:195:0x052e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0535 A[LOOP:11: B:196:0x052f->B:198:0x0535, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x053e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0543  */
    /* JADX WARN: Code duplicated, block: B:205:0x0551 A[LOOP:12: B:203:0x054d->B:205:0x0551, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0564 A[LOOP:13: B:207:0x055e->B:209:0x0564, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x057c  */
    /* JADX WARN: Code duplicated, block: B:215:0x058d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0591  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x0610 A[LOOP:15: B:220:0x060c->B:222:0x0610, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x062d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0641  */
    /* JADX WARN: Code duplicated, block: B:228:0x0644  */
    /* JADX WARN: Code duplicated, block: B:232:0x065a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0671  */
    /* JADX WARN: Code duplicated, block: B:256:0x042c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0447 A[EDGE_INSN: B:258:0x0447->B:176:0x0447 BREAK  A[LOOP:9: B:168:0x041b->B:259:0x041b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x04e5 A[EDGE_INSN: B:262:0x04e5->B:185:0x04e5 BREAK  A[LOOP:10: B:182:0x04d5->B:184:0x04d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0538 A[EDGE_INSN: B:263:0x0538->B:199:0x0538 BREAK  A[LOOP:11: B:196:0x052f->B:198:0x0535], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0676 A[EDGE_INSN: B:266:0x0676->B:235:0x0676 BREAK  A[LOOP:14: B:210:0x0567->B:233:0x0667], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x061c A[EDGE_INSN: B:269:0x061c->B:223:0x061c BREAK  A[LOOP:15: B:220:0x060c->B:222:0x0610], SYNTHETIC] */
    public int GetOptimum(int i) throws IOException {
        int iReadMatchDistances;
        int i2;
        int iStateUpdateChar;
        int i3;
        int i4;
        int iStateUpdateRep;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iGetPrice0;
        int i15;
        int i16;
        int iGetPosLenPrice;
        int i17;
        Optimal optimal;
        int iGetMatchLen;
        int i18;
        int i19;
        int i20;
        int iGetRepPrice;
        Optimal optimal2;
        int i21;
        int[] iArr;
        int iGetMatchLen2;
        int i22;
        int i23;
        int iGetRepPrice2;
        Optimal optimal3;
        int iGetMatchLen3;
        int i24;
        int i25;
        int i26;
        int iGetRepPrice3;
        Optimal optimal4;
        int iStateUpdateRep2;
        int i27 = i;
        int i28 = this._optimumEndIndex;
        int i29 = this._optimumCurrentIndex;
        if (i28 != i29) {
            Optimal optimal5 = this._optimum[i29];
            int i30 = optimal5.PosPrev;
            int i31 = i30 - i29;
            this.backRes = optimal5.BackPrev;
            this._optimumCurrentIndex = i30;
            return i31;
        }
        char c = 0;
        this._optimumEndIndex = 0;
        this._optimumCurrentIndex = 0;
        if (this._longestMatchWasFound) {
            iReadMatchDistances = this._longestMatchLength;
            this._longestMatchWasFound = false;
        } else {
            iReadMatchDistances = ReadMatchDistances();
        }
        int i32 = this._numDistancePairs;
        int i33 = 2;
        if (this._matchFinder.GetNumAvailableBytes() + 1 < 2) {
            this.backRes = -1;
            return 1;
        }
        int i34 = 0;
        int i35 = 0;
        while (true) {
            if (i34 >= 4) {
                break;
            }
            int[] iArr2 = this.reps;
            int i36 = this._repDistances[i34];
            iArr2[i34] = i36;
            this.repLens[i34] = this._matchFinder.GetMatchLen(-1, i36, 273);
            int[] iArr3 = this.repLens;
            if (iArr3[i34] > iArr3[i35]) {
                i35 = i34;
            }
            i34++;
        }
        int i37 = this.repLens[i35];
        int i38 = this._numFastBytes;
        if (i37 >= i38) {
            this.backRes = i35;
            MovePos(i37 - 1);
            return i37;
        }
        if (iReadMatchDistances >= i38) {
            this.backRes = this._matchDistances[i32 - 1] + 4;
            MovePos(iReadMatchDistances - 1);
            return iReadMatchDistances;
        }
        byte bGetIndexByte = this._matchFinder.GetIndexByte(-1);
        byte bGetIndexByte2 = this._matchFinder.GetIndexByte((-2) - this._repDistances[0]);
        if (iReadMatchDistances < 2 && bGetIndexByte != bGetIndexByte2 && this.repLens[i35] < 2) {
            this.backRes = -1;
            return 1;
        }
        Optimal[] optimalArr = this._optimum;
        Optimal optimal6 = optimalArr[0];
        int i39 = this._state;
        optimal6.State = i39;
        int i40 = this._posStateMask & i27;
        optimalArr[1].Price = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[(i39 << 4) + i40]) + this._literalEncoder.GetSubCoder(i27, this._previousByte).GetPrice(!Base.StateIsCharState(this._state), bGetIndexByte2, bGetIndexByte);
        this._optimum[1].MakeAsChar();
        int iGetPrice1 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(this._state << 4) + i40]);
        int iGetPrice2 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[this._state]) + iGetPrice1;
        if (bGetIndexByte2 == bGetIndexByte) {
            int iGetRepLen1Price = GetRepLen1Price(this._state, i40) + iGetPrice2;
            Optimal optimal7 = this._optimum[1];
            if (iGetRepLen1Price < optimal7.Price) {
                optimal7.Price = iGetRepLen1Price;
                optimal7.MakeAsShortRep();
            }
        }
        int i41 = this.repLens[i35];
        if (iReadMatchDistances >= i41) {
            i41 = iReadMatchDistances;
        }
        if (i41 < 2) {
            this.backRes = this._optimum[1].BackPrev;
            return 1;
        }
        Optimal[] optimalArr2 = this._optimum;
        optimalArr2[1].PosPrev = 0;
        Optimal optimal8 = optimalArr2[0];
        int[] iArr4 = this.reps;
        optimal8.Backs0 = iArr4[0];
        optimal8.Backs1 = iArr4[1];
        optimal8.Backs2 = iArr4[2];
        optimal8.Backs3 = iArr4[3];
        int i42 = i41;
        while (true) {
            int i43 = i42 - 1;
            this._optimum[i42].Price = kIfinityPrice;
            if (i43 < 2) {
                break;
            }
            i42 = i43;
        }
        int i44 = 0;
        for (i2 = 4; i44 < i2; i2 = 4) {
            int i45 = this.repLens[i44];
            if (i45 >= 2) {
                int iGetPureRepPrice = GetPureRepPrice(i44, this._state, i40) + iGetPrice2;
                do {
                    int iGetPrice = this._repMatchLenEncoder.GetPrice(i45 - 2, i40) + iGetPureRepPrice;
                    Optimal optimal9 = this._optimum[i45];
                    if (iGetPrice < optimal9.Price) {
                        optimal9.Price = iGetPrice;
                        optimal9.PosPrev = 0;
                        optimal9.BackPrev = i44;
                        optimal9.Prev1IsChar = false;
                    }
                    i45--;
                } while (i45 >= 2);
            }
            i44++;
        }
        int iGetPrice3 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRep[this._state]) + iGetPrice1;
        int i46 = this.repLens[0];
        int i47 = i46 >= 2 ? i46 + 1 : 2;
        if (i47 <= iReadMatchDistances) {
            int i48 = 0;
            while (i47 > this._matchDistances[i48]) {
                i48 += 2;
            }
            while (true) {
                int i49 = this._matchDistances[i48 + 1];
                int iGetPosLenPrice2 = GetPosLenPrice(i49, i47, i40) + iGetPrice3;
                Optimal optimal10 = this._optimum[i47];
                if (iGetPosLenPrice2 < optimal10.Price) {
                    optimal10.Price = iGetPosLenPrice2;
                    optimal10.PosPrev = 0;
                    optimal10.BackPrev = i49 + 4;
                    optimal10.Prev1IsChar = false;
                }
                if (i47 == this._matchDistances[i48] && (i48 = i48 + 2) == i32) {
                    break;
                }
                i47++;
            }
        }
        int i50 = 0;
        while (true) {
            i50++;
            if (i50 == i41) {
                return Backward(i50);
            }
            int iReadMatchDistances2 = ReadMatchDistances();
            int i51 = this._numDistancePairs;
            if (iReadMatchDistances2 >= this._numFastBytes) {
                this._longestMatchLength = iReadMatchDistances2;
                this._longestMatchWasFound = true;
                return Backward(i50);
            }
            int i52 = i27 + 1;
            Optimal[] optimalArr3 = this._optimum;
            Optimal optimal11 = optimalArr3[i50];
            int i53 = optimal11.PosPrev;
            if (optimal11.Prev1IsChar) {
                i53--;
                if (optimal11.Prev2) {
                    int i54 = optimalArr3[optimal11.PosPrev2].State;
                    iStateUpdateRep2 = optimal11.BackPrev2 < 4 ? Base.StateUpdateRep(i54) : Base.StateUpdateMatch(i54);
                } else {
                    iStateUpdateRep2 = optimalArr3[i53].State;
                }
                iStateUpdateChar = Base.StateUpdateChar(iStateUpdateRep2);
            } else {
                iStateUpdateChar = optimalArr3[i53].State;
            }
            if (i53 == i50) {
                iStateUpdateRep = this._optimum[i50].IsShortRep() ? Base.StateUpdateShortRep(iStateUpdateChar) : Base.StateUpdateChar(iStateUpdateChar);
            } else {
                Optimal optimal12 = this._optimum[i50];
                if (optimal12.Prev1IsChar && optimal12.Prev2) {
                    i53 = optimal12.PosPrev2;
                    i3 = optimal12.BackPrev2;
                    iStateUpdateRep = Base.StateUpdateRep(iStateUpdateChar);
                    i4 = 4;
                } else {
                    i3 = optimal12.BackPrev;
                    i4 = 4;
                    iStateUpdateRep = i3 < 4 ? Base.StateUpdateRep(iStateUpdateChar) : Base.StateUpdateMatch(iStateUpdateChar);
                }
                Optimal optimal13 = this._optimum[i53];
                if (i3 >= i4) {
                    int[] iArr5 = this.reps;
                    iArr5[c] = i3 - 4;
                    iArr5[1] = optimal13.Backs0;
                    iArr5[i33] = optimal13.Backs1;
                    iArr5[3] = optimal13.Backs2;
                } else if (i3 == 0) {
                    int[] iArr6 = this.reps;
                    iArr6[c] = optimal13.Backs0;
                    iArr6[1] = optimal13.Backs1;
                    iArr6[i33] = optimal13.Backs2;
                    iArr6[3] = optimal13.Backs3;
                } else if (i3 == 1) {
                    int[] iArr7 = this.reps;
                    iArr7[c] = optimal13.Backs1;
                    iArr7[1] = optimal13.Backs0;
                    iArr7[i33] = optimal13.Backs2;
                    iArr7[3] = optimal13.Backs3;
                } else if (i3 == i33) {
                    int[] iArr8 = this.reps;
                    iArr8[c] = optimal13.Backs2;
                    iArr8[1] = optimal13.Backs0;
                    iArr8[i33] = optimal13.Backs1;
                    iArr8[3] = optimal13.Backs3;
                } else {
                    int[] iArr9 = this.reps;
                    iArr9[c] = optimal13.Backs3;
                    iArr9[1] = optimal13.Backs0;
                    iArr9[i33] = optimal13.Backs1;
                    iArr9[3] = optimal13.Backs2;
                }
            }
            Optimal optimal14 = this._optimum[i50];
            optimal14.State = iStateUpdateRep;
            int[] iArr10 = this.reps;
            optimal14.Backs0 = iArr10[c];
            optimal14.Backs1 = iArr10[1];
            optimal14.Backs2 = iArr10[i33];
            optimal14.Backs3 = iArr10[3];
            int i55 = optimal14.Price;
            byte bGetIndexByte3 = this._matchFinder.GetIndexByte(-1);
            byte bGetIndexByte4 = this._matchFinder.GetIndexByte((-2) - this.reps[c]);
            int i56 = this._posStateMask & i52;
            int i57 = (iStateUpdateRep << 4) + i56;
            int i58 = i41;
            int iGetPrice4 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[i57]) + i55 + this._literalEncoder.GetSubCoder(i52, this._matchFinder.GetIndexByte(-2)).GetPrice(!Base.StateIsCharState(iStateUpdateRep), bGetIndexByte4, bGetIndexByte3);
            int i59 = i50 + 2;
            Optimal optimal15 = this._optimum[i59];
            if (iGetPrice4 < optimal15.Price) {
                optimal15.Price = iGetPrice4;
                optimal15.PosPrev = i50;
                optimal15.MakeAsChar();
                z = true;
            } else {
                z = false;
            }
            int iGetPrice5 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[i57]) + i55;
            int iGetPrice6 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateRep]) + iGetPrice5;
            if (bGetIndexByte4 != bGetIndexByte3 || (optimal15.PosPrev < i50 && optimal15.BackPrev == 0)) {
                z2 = z;
            } else {
                int iGetRepLen1Price2 = GetRepLen1Price(iStateUpdateRep, i56) + iGetPrice6;
                z2 = z;
                if (iGetRepLen1Price2 <= optimal15.Price) {
                    optimal15.Price = iGetRepLen1Price2;
                    optimal15.PosPrev = i50;
                    optimal15.MakeAsShortRep();
                    z2 = true;
                }
            }
            int iMin = Math.min(4095 - i50, this._matchFinder.GetNumAvailableBytes() + 1);
            if (iMin < 2) {
                i41 = i58;
                i27 = i52;
            } else {
                int i60 = this._numFastBytes;
                int i61 = iMin > i60 ? i60 : iMin;
                if (z2 || bGetIndexByte4 == bGetIndexByte3) {
                    i5 = iGetPrice5;
                } else {
                    i5 = iGetPrice5;
                    int iGetMatchLen4 = this._matchFinder.GetMatchLen(0, this.reps[0], Math.min(iMin - 1, i60));
                    if (iGetMatchLen4 >= 2) {
                        int iStateUpdateChar2 = Base.StateUpdateChar(iStateUpdateRep);
                        int i62 = (i27 + 2) & this._posStateMask;
                        int iGetPrice7 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateChar2]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(iStateUpdateChar2 << 4) + i62]) + iGetPrice4;
                        int i63 = i59 + iGetMatchLen4;
                        int i64 = i58;
                        while (i64 < i63) {
                            int i65 = i64 + 1;
                            this._optimum[i65].Price = kIfinityPrice;
                            i64 = i65;
                            iReadMatchDistances2 = iReadMatchDistances2;
                        }
                        i6 = iReadMatchDistances2;
                        int iGetRepPrice4 = GetRepPrice(0, iGetMatchLen4, iStateUpdateChar2, i62) + iGetPrice7;
                        Optimal optimal16 = this._optimum[i63];
                        if (iGetRepPrice4 < optimal16.Price) {
                            optimal16.Price = iGetRepPrice4;
                            optimal16.PosPrev = i59;
                            optimal16.BackPrev = 0;
                            optimal16.Prev1IsChar = true;
                            optimal16.Prev2 = false;
                        }
                        i41 = i64;
                    }
                    i7 = 0;
                    i9 = 2;
                    for (i8 = 4; i7 < i8; i8 = 4) {
                        iGetMatchLen2 = this._matchFinder.GetMatchLen(-1, this.reps[i7], i61);
                        if (iGetMatchLen2 < 2) {
                            iMin = iMin;
                            i52 = i52;
                            iGetPrice6 = iGetPrice6;
                        } else {
                            i22 = iGetMatchLen2;
                            while (true) {
                                i23 = i50 + i22;
                                if (i41 < i23) {
                                    iGetRepPrice2 = GetRepPrice(i7, i22, iStateUpdateRep, i56) + iGetPrice6;
                                    optimal3 = this._optimum[i23];
                                    if (iGetRepPrice2 < optimal3.Price) {
                                        optimal3.Price = iGetRepPrice2;
                                        optimal3.PosPrev = i50;
                                        optimal3.BackPrev = i7;
                                        optimal3.Prev1IsChar = false;
                                    }
                                    i22--;
                                    if (i22 < 2) {
                                        break;
                                    }
                                } else {
                                    i41++;
                                    this._optimum[i41].Price = kIfinityPrice;
                                }
                            }
                            if (i7 == 0) {
                                i9 = iGetMatchLen2 + 1;
                            }
                            if (iGetMatchLen2 < iMin) {
                                iGetMatchLen3 = this._matchFinder.GetMatchLen(iGetMatchLen2, this.reps[i7], Math.min((iMin - 1) - iGetMatchLen2, this._numFastBytes));
                                if (iGetMatchLen3 >= 2) {
                                    int iStateUpdateRep3 = Base.StateUpdateRep(iStateUpdateRep);
                                    int i66 = i52 + iGetMatchLen2;
                                    int i67 = this._posStateMask & i66;
                                    int iGetRepPrice5 = GetRepPrice(i7, iGetMatchLen2, iStateUpdateRep, i56) + iGetPrice6;
                                    int i68 = i41;
                                    int i69 = iGetMatchLen2 - 1;
                                    int iGetPrice8 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[(iStateUpdateRep3 << 4) + i67]) + iGetRepPrice5 + this._literalEncoder.GetSubCoder(i66, this._matchFinder.GetIndexByte(iGetMatchLen2 - 2)).GetPrice(true, this._matchFinder.GetIndexByte(i69 - (this.reps[i7] + 1)), this._matchFinder.GetIndexByte(i69));
                                    int iStateUpdateChar3 = Base.StateUpdateChar(iStateUpdateRep3);
                                    int i70 = this._posStateMask & (i66 + 1);
                                    int iGetPrice9 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateChar3]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(iStateUpdateChar3 << 4) + i70]) + iGetPrice8;
                                    i24 = iGetMatchLen2 + 1 + iGetMatchLen3;
                                    i25 = i68;
                                    while (true) {
                                        i26 = i50 + i24;
                                        if (i25 < i26) {
                                            break;
                                        }
                                        i25++;
                                        this._optimum[i25].Price = kIfinityPrice;
                                    }
                                    iGetRepPrice3 = GetRepPrice(0, iGetMatchLen3, iStateUpdateChar3, i70) + iGetPrice9;
                                    optimal4 = this._optimum[i26];
                                    if (iGetRepPrice3 < optimal4.Price) {
                                        optimal4.Price = iGetRepPrice3;
                                        optimal4.PosPrev = iGetMatchLen2 + i50 + 1;
                                        optimal4.BackPrev = 0;
                                        optimal4.Prev1IsChar = true;
                                        optimal4.Prev2 = true;
                                        optimal4.PosPrev2 = i50;
                                        optimal4.BackPrev2 = i7;
                                    }
                                    i41 = i25;
                                } else {
                                    i41 = i41;
                                }
                            } else {
                                i41 = i41;
                            }
                            i9 = i9;
                        }
                        i7++;
                        iGetPrice6 = iGetPrice6;
                        i52 = i52;
                        iMin = iMin;
                    }
                    i10 = iMin;
                    i11 = i52;
                    i12 = i6;
                    if (i12 > i61) {
                        i21 = 0;
                        while (true) {
                            iArr = this._matchDistances;
                            if (i61 > iArr[i21]) {
                                break;
                            }
                            i21 += 2;
                        }
                        iArr[i21] = i61;
                        i14 = i21 + 2;
                        i13 = i61;
                    } else {
                        i13 = i12;
                        i14 = i51;
                    }
                    if (i13 >= i9) {
                        iGetPrice0 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRep[iStateUpdateRep]) + i5;
                        while (i41 < i50 + i13) {
                            i41++;
                            this._optimum[i41].Price = kIfinityPrice;
                        }
                        i15 = 0;
                        while (i9 > this._matchDistances[i15]) {
                            i15 += 2;
                        }
                        while (true) {
                            i16 = this._matchDistances[i15 + 1];
                            iGetPosLenPrice = GetPosLenPrice(i16, i9, i56) + iGetPrice0;
                            i17 = i50 + i9;
                            optimal = this._optimum[i17];
                            if (iGetPosLenPrice < optimal.Price) {
                                optimal.Price = iGetPosLenPrice;
                                optimal.PosPrev = i50;
                                optimal.BackPrev = i16 + 4;
                                optimal.Prev1IsChar = false;
                            }
                            if (i9 == this._matchDistances[i15]) {
                                i10 = i10;
                                if (i9 < i10) {
                                    iGetMatchLen = this._matchFinder.GetMatchLen(i9, i16, Math.min((i10 - 1) - i9, this._numFastBytes));
                                    if (iGetMatchLen >= 2) {
                                        int iStateUpdateMatch = Base.StateUpdateMatch(iStateUpdateRep);
                                        int i71 = i11 + i9;
                                        int i72 = i41;
                                        int iGetPrice10 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[(iStateUpdateMatch << 4) + (this._posStateMask & i71)]) + iGetPosLenPrice + this._literalEncoder.GetSubCoder(i71, this._matchFinder.GetIndexByte(i9 - 2)).GetPrice(true, this._matchFinder.GetIndexByte((i9 - (i16 + 1)) - 1), this._matchFinder.GetIndexByte(i9 - 1));
                                        int iStateUpdateChar4 = Base.StateUpdateChar(iStateUpdateMatch);
                                        int i73 = this._posStateMask & (i71 + 1);
                                        int iGetPrice11 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateChar4]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(iStateUpdateChar4 << 4) + i73]) + iGetPrice10;
                                        i18 = i9 + 1 + iGetMatchLen;
                                        i19 = i72;
                                        while (true) {
                                            i20 = i50 + i18;
                                            if (i19 < i20) {
                                                break;
                                            }
                                            i19++;
                                            this._optimum[i19].Price = kIfinityPrice;
                                        }
                                        iGetRepPrice = GetRepPrice(0, iGetMatchLen, iStateUpdateChar4, i73) + iGetPrice11;
                                        optimal2 = this._optimum[i20];
                                        if (iGetRepPrice < optimal2.Price) {
                                            optimal2.Price = iGetRepPrice;
                                            optimal2.PosPrev = i17 + 1;
                                            optimal2.BackPrev = 0;
                                            optimal2.Prev1IsChar = true;
                                            optimal2.Prev2 = true;
                                            optimal2.PosPrev2 = i50;
                                            optimal2.BackPrev2 = i16 + 4;
                                        }
                                        i41 = i19;
                                    } else {
                                        i41 = i41;
                                    }
                                } else {
                                    i41 = i41;
                                }
                                i15 += 2;
                                if (i15 == i14) {
                                    break;
                                }
                            } else {
                                iGetPrice0 = iGetPrice0;
                                iStateUpdateRep = iStateUpdateRep;
                                i56 = i56;
                            }
                            i9++;
                            iGetPrice0 = iGetPrice0;
                            iStateUpdateRep = iStateUpdateRep;
                            i56 = i56;
                        }
                    }
                    i27 = i11;
                }
                i6 = iReadMatchDistances2;
                i41 = i58;
                i7 = 0;
                i9 = 2;
                while (i7 < i8) {
                    iGetMatchLen2 = this._matchFinder.GetMatchLen(-1, this.reps[i7], i61);
                    if (iGetMatchLen2 < 2) {
                        iMin = iMin;
                        i52 = i52;
                        iGetPrice6 = iGetPrice6;
                    } else {
                        i22 = iGetMatchLen2;
                        while (true) {
                            i23 = i50 + i22;
                            if (i41 < i23) {
                                iGetRepPrice2 = GetRepPrice(i7, i22, iStateUpdateRep, i56) + iGetPrice6;
                                optimal3 = this._optimum[i23];
                                if (iGetRepPrice2 < optimal3.Price) {
                                    optimal3.Price = iGetRepPrice2;
                                    optimal3.PosPrev = i50;
                                    optimal3.BackPrev = i7;
                                    optimal3.Prev1IsChar = false;
                                }
                                i22--;
                                if (i22 < 2) {
                                    break;
                                    break;
                                }
                            } else {
                                i41++;
                                this._optimum[i41].Price = kIfinityPrice;
                            }
                        }
                        if (i7 == 0) {
                            i9 = iGetMatchLen2 + 1;
                        }
                        if (iGetMatchLen2 < iMin) {
                            iGetMatchLen3 = this._matchFinder.GetMatchLen(iGetMatchLen2, this.reps[i7], Math.min((iMin - 1) - iGetMatchLen2, this._numFastBytes));
                            if (iGetMatchLen3 >= 2) {
                                int iStateUpdateRep4 = Base.StateUpdateRep(iStateUpdateRep);
                                int i610 = i52 + iGetMatchLen2;
                                int i611 = this._posStateMask & i610;
                                int iGetRepPrice6 = GetRepPrice(i7, iGetMatchLen2, iStateUpdateRep, i56) + iGetPrice6;
                                int i612 = i41;
                                int i613 = iGetMatchLen2 - 1;
                                int iGetPrice12 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[(iStateUpdateRep4 << 4) + i611]) + iGetRepPrice6 + this._literalEncoder.GetSubCoder(i610, this._matchFinder.GetIndexByte(iGetMatchLen2 - 2)).GetPrice(true, this._matchFinder.GetIndexByte(i613 - (this.reps[i7] + 1)), this._matchFinder.GetIndexByte(i613));
                                int iStateUpdateChar5 = Base.StateUpdateChar(iStateUpdateRep4);
                                int i74 = this._posStateMask & (i610 + 1);
                                int iGetPrice13 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateChar5]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(iStateUpdateChar5 << 4) + i74]) + iGetPrice12;
                                i24 = iGetMatchLen2 + 1 + iGetMatchLen3;
                                i25 = i612;
                                while (true) {
                                    i26 = i50 + i24;
                                    if (i25 < i26) {
                                        break;
                                        break;
                                    }
                                    i25++;
                                    this._optimum[i25].Price = kIfinityPrice;
                                }
                                iGetRepPrice3 = GetRepPrice(0, iGetMatchLen3, iStateUpdateChar5, i74) + iGetPrice13;
                                optimal4 = this._optimum[i26];
                                if (iGetRepPrice3 < optimal4.Price) {
                                    optimal4.Price = iGetRepPrice3;
                                    optimal4.PosPrev = iGetMatchLen2 + i50 + 1;
                                    optimal4.BackPrev = 0;
                                    optimal4.Prev1IsChar = true;
                                    optimal4.Prev2 = true;
                                    optimal4.PosPrev2 = i50;
                                    optimal4.BackPrev2 = i7;
                                }
                                i41 = i25;
                            } else {
                                i41 = i41;
                            }
                        } else {
                            i41 = i41;
                        }
                        i9 = i9;
                    }
                    i7++;
                    iGetPrice6 = iGetPrice6;
                    i52 = i52;
                    iMin = iMin;
                }
                i10 = iMin;
                i11 = i52;
                i12 = i6;
                if (i12 > i61) {
                    i21 = 0;
                    while (true) {
                        iArr = this._matchDistances;
                        if (i61 > iArr[i21]) {
                            break;
                            break;
                        }
                        i21 += 2;
                    }
                    iArr[i21] = i61;
                    i14 = i21 + 2;
                    i13 = i61;
                } else {
                    i13 = i12;
                    i14 = i51;
                }
                if (i13 >= i9) {
                    iGetPrice0 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRep[iStateUpdateRep]) + i5;
                    while (i41 < i50 + i13) {
                        i41++;
                        this._optimum[i41].Price = kIfinityPrice;
                    }
                    i15 = 0;
                    while (i9 > this._matchDistances[i15]) {
                        i15 += 2;
                    }
                    while (true) {
                        i16 = this._matchDistances[i15 + 1];
                        iGetPosLenPrice = GetPosLenPrice(i16, i9, i56) + iGetPrice0;
                        i17 = i50 + i9;
                        optimal = this._optimum[i17];
                        if (iGetPosLenPrice < optimal.Price) {
                            optimal.Price = iGetPosLenPrice;
                            optimal.PosPrev = i50;
                            optimal.BackPrev = i16 + 4;
                            optimal.Prev1IsChar = false;
                        }
                        if (i9 == this._matchDistances[i15]) {
                            i10 = i10;
                            if (i9 < i10) {
                                iGetMatchLen = this._matchFinder.GetMatchLen(i9, i16, Math.min((i10 - 1) - i9, this._numFastBytes));
                                if (iGetMatchLen >= 2) {
                                    int iStateUpdateMatch2 = Base.StateUpdateMatch(iStateUpdateRep);
                                    int i75 = i11 + i9;
                                    int i76 = i41;
                                    int iGetPrice14 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isMatch[(iStateUpdateMatch2 << 4) + (this._posStateMask & i75)]) + iGetPosLenPrice + this._literalEncoder.GetSubCoder(i75, this._matchFinder.GetIndexByte(i9 - 2)).GetPrice(true, this._matchFinder.GetIndexByte((i9 - (i16 + 1)) - 1), this._matchFinder.GetIndexByte(i9 - 1));
                                    int iStateUpdateChar6 = Base.StateUpdateChar(iStateUpdateMatch2);
                                    int i77 = this._posStateMask & (i75 + 1);
                                    int iGetPrice15 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep[iStateUpdateChar6]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isMatch[(iStateUpdateChar6 << 4) + i77]) + iGetPrice14;
                                    i18 = i9 + 1 + iGetMatchLen;
                                    i19 = i76;
                                    while (true) {
                                        i20 = i50 + i18;
                                        if (i19 < i20) {
                                            break;
                                            break;
                                        }
                                        i19++;
                                        this._optimum[i19].Price = kIfinityPrice;
                                    }
                                    iGetRepPrice = GetRepPrice(0, iGetMatchLen, iStateUpdateChar6, i77) + iGetPrice15;
                                    optimal2 = this._optimum[i20];
                                    if (iGetRepPrice < optimal2.Price) {
                                        optimal2.Price = iGetRepPrice;
                                        optimal2.PosPrev = i17 + 1;
                                        optimal2.BackPrev = 0;
                                        optimal2.Prev1IsChar = true;
                                        optimal2.Prev2 = true;
                                        optimal2.PosPrev2 = i50;
                                        optimal2.BackPrev2 = i16 + 4;
                                    }
                                    i41 = i19;
                                } else {
                                    i41 = i41;
                                }
                            } else {
                                i41 = i41;
                            }
                            i15 += 2;
                            if (i15 == i14) {
                                break;
                                break;
                            }
                        } else {
                            iGetPrice0 = iGetPrice0;
                            iStateUpdateRep = iStateUpdateRep;
                            i56 = i56;
                        }
                        i9++;
                        iGetPrice0 = iGetPrice0;
                        iStateUpdateRep = iStateUpdateRep;
                        i56 = i56;
                    }
                }
                i27 = i11;
            }
            c = 0;
            i33 = 2;
        }
    }

    public int GetPosLenPrice(int i, int i2, int i3) {
        int i4;
        int iGetLenToPosState = Base.GetLenToPosState(i2);
        if (i < 128) {
            i4 = this._distancesPrices[(iGetLenToPosState * 128) + i];
        } else {
            i4 = this._alignPrices[i & 15] + this._posSlotPrices[GetPosSlot2(i) + (iGetLenToPosState << 6)];
        }
        return i4 + this._lenEncoder.GetPrice(i2 - 2, i3);
    }

    public int GetPureRepPrice(int i, int i2, int i3) {
        if (i == 0) {
            return com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRep0Long[(i2 << 4) + i3]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRepG0[i2]);
        }
        int iGetPrice1 = com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRepG0[i2]);
        if (i == 1) {
            return com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRepG1[i2]) + iGetPrice1;
        }
        return com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice(this._isRepG2[i2], i - 2) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice1(this._isRepG1[i2]) + iGetPrice1;
    }

    public int GetRepLen1Price(int i, int i2) {
        return com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRep0Long[(i << 4) + i2]) + com.badlogic.gdx.utils.compression.rangecoder.Encoder.GetPrice0(this._isRepG0[i]);
    }

    public int GetRepPrice(int i, int i2, int i3, int i4) {
        return GetPureRepPrice(i, i3, i4) + this._repMatchLenEncoder.GetPrice(i2 - 2, i4);
    }

    public void Init() {
        BaseInit();
        this._rangeEncoder.Init();
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isMatch);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isRep0Long);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isRep);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isRepG0);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isRepG1);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._isRepG2);
        com.badlogic.gdx.utils.compression.rangecoder.Encoder.InitBitModels(this._posEncoders);
        this._literalEncoder.Init();
        for (int i = 0; i < 4; i++) {
            this._posSlotEncoder[i].Init();
        }
        this._lenEncoder.Init(1 << this._posStateBits);
        this._repMatchLenEncoder.Init(1 << this._posStateBits);
        this._posAlignEncoder.Init();
        this._longestMatchWasFound = false;
        this._optimumEndIndex = 0;
        this._optimumCurrentIndex = 0;
        this._additionalOffset = 0;
    }

    public void MovePos(int i) throws IOException {
        if (i > 0) {
            this._matchFinder.Skip(i);
            this._additionalOffset += i;
        }
    }

    public int ReadMatchDistances() throws IOException {
        int iGetMatchLen;
        int iGetMatches = this._matchFinder.GetMatches(this._matchDistances);
        this._numDistancePairs = iGetMatches;
        if (iGetMatches > 0) {
            int[] iArr = this._matchDistances;
            iGetMatchLen = iArr[iGetMatches - 2];
            if (iGetMatchLen == this._numFastBytes) {
                iGetMatchLen += this._matchFinder.GetMatchLen(iGetMatchLen - 1, iArr[iGetMatches - 1], 273 - iGetMatchLen);
            }
        } else {
            iGetMatchLen = 0;
        }
        this._additionalOffset++;
        return iGetMatchLen;
    }

    public void ReleaseMFStream() {
        BinTree binTree = this._matchFinder;
        if (binTree == null || !this._needReleaseMFStream) {
            return;
        }
        binTree.ReleaseStream();
        this._needReleaseMFStream = false;
    }

    public void ReleaseOutStream() {
        this._rangeEncoder.ReleaseStream();
    }

    public void ReleaseStreams() {
        ReleaseMFStream();
        ReleaseOutStream();
    }

    public boolean SetAlgorithm(int i) {
        return true;
    }

    public boolean SetDictionarySize(int i) {
        int i2 = 0;
        if (i < 1 || i > 536870912) {
            return false;
        }
        this._dictionarySize = i;
        while (i > (1 << i2)) {
            i2++;
        }
        this._distTableSize = i2 * 2;
        return true;
    }

    public void SetEndMarkerMode(boolean z) {
        this._writeEndMark = z;
    }

    public boolean SetLcLpPb(int i, int i2, int i3) {
        if (i2 < 0 || i2 > 4 || i < 0 || i > 8 || i3 < 0 || i3 > 4) {
            return false;
        }
        this._numLiteralPosStateBits = i2;
        this._numLiteralContextBits = i;
        this._posStateBits = i3;
        this._posStateMask = (1 << i3) - 1;
        return true;
    }

    public boolean SetMatchFinder(int i) {
        if (i < 0 || i > 2) {
            return false;
        }
        int i2 = this._matchFinderType;
        this._matchFinderType = i;
        if (this._matchFinder == null || i2 == i) {
            return true;
        }
        this._dictionarySizePrev = -1;
        this._matchFinder = null;
        return true;
    }

    public boolean SetNumFastBytes(int i) {
        if (i < 5 || i > 273) {
            return false;
        }
        this._numFastBytes = i;
        return true;
    }

    public void SetOutStream(OutputStream outputStream) {
        this._rangeEncoder.SetStream(outputStream);
    }

    public void SetStreams(InputStream inputStream, OutputStream outputStream, long j, long j2) {
        this._inStream = inputStream;
        this._finished = false;
        Create();
        SetOutStream(outputStream);
        Init();
        FillDistancesPrices();
        FillAlignPrices();
        this._lenEncoder.SetTableSize(this._numFastBytes - 1);
        this._lenEncoder.UpdateTables(1 << this._posStateBits);
        this._repMatchLenEncoder.SetTableSize(this._numFastBytes - 1);
        this._repMatchLenEncoder.UpdateTables(1 << this._posStateBits);
        this.nowPos64 = 0L;
    }

    public void SetWriteEndMarkerMode(boolean z) {
        this._writeEndMark = z;
    }

    public void WriteCoderProperties(OutputStream outputStream) throws IOException {
        this.properties[0] = (byte) ((((this._posStateBits * 5) + this._numLiteralPosStateBits) * 9) + this._numLiteralContextBits);
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            this.properties[i2] = (byte) (this._dictionarySize >> (i * 8));
            i = i2;
        }
        outputStream.write(this.properties, 0, 5);
    }

    public void WriteEndMarker(int i) throws IOException {
        if (this._writeEndMark) {
            this._rangeEncoder.Encode(this._isMatch, (this._state << 4) + i, 1);
            this._rangeEncoder.Encode(this._isRep, this._state, 0);
            this._state = Base.StateUpdateMatch(this._state);
            this._lenEncoder.Encode(this._rangeEncoder, 0, i);
            this._posSlotEncoder[Base.GetLenToPosState(2)].Encode(this._rangeEncoder, 63);
            this._rangeEncoder.EncodeDirectBits(67108863, 26);
            this._posAlignEncoder.ReverseEncode(this._rangeEncoder, 15);
        }
    }
}
