package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFa1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static int afInfoLog;
    private static int afVerboseLog;
    private static int afWarnLog;
    public static final Map d;
    private static Object e;
    private static long force;
    private static Object i;
    private static byte[] unregisterClient;
    private static long v;
    private static byte[] w;

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r0 = com.appsflyer.internal.AFa1hSDK.$13
            int r1 = r0 + 115
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$12 = r1
            byte[] r1 = com.appsflyer.internal.AFa1hSDK.$$a
            int r2 = r6 + 1
            int r8 = 1173 - r8
            int r7 = 119 - r7
            byte[] r2 = new byte[r2]
            r3 = 0
            if (r1 != 0) goto L26
            int r0 = r0 + 121
            int r4 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$12 = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L22
            r0 = 60
            int r0 = r0 / r3
        L22:
            r0 = r8
            r4 = r1
            r1 = r3
            goto L3b
        L26:
            r0 = r3
        L27:
            byte r4 = (byte) r7
            r2[r0] = r4
            if (r0 != r6) goto L32
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r3)
            return r6
        L32:
            int r0 = r0 + 1
            r4 = r1[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r5
        L3b:
            int r7 = r7 + r8
            int r7 = r7 + (-3)
            int r8 = r0 + 1
            r0 = r1
            r1 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1hSDK.$$c(short, short, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 75901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1hSDK.<clinit>():void");
    }

    private AFa1hSDK() {
    }

    private static void AFAdRevenueData(int i2, int i3) {
        $11 = ($10 + 77) % 128;
    }

    public static int getMonetizationNetwork(int i2) throws Throwable {
        int i3 = $10 + 85;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = i;
        $10 = ((i4 ^ 63) + ((i4 & 63) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e).getMethod($$c(bArr[72], bArr[4], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) throws Throwable {
        int i2 = $11;
        Object obj2 = i;
        $10 = (((i2 | 39) << 1) - (i2 ^ 39)) % 128;
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e).getMethod($$c(bArr[12], bArr[85], (short) 551), Object.class).invoke(obj2, obj)).intValue();
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2 = $11;
        $10 = (((i2 | 113) << 1) - (i2 ^ 113)) % 128;
        byte[] bArr = new byte[1194];
        System.arraycopy("\u000f×sN\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ3õô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u00063Ø\u0004\u0001\u00042Î\u00073Ô\u00030Ð\u00056ÿÏ\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉDäô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓ3õô\n\u000b\u0003\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ðû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ:îô\nÜL5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9\u0003\u0000\u0004Ó\u0006\u0004\u0003\u0005ý\u0003\u0007þ\u00060\u0002\u0004Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006ü\u0001\u0012Ò5\u0000\u0003ö\fø\u0019Ó-ÿÈ\u0001\u0002\t\u000f/ø\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1194);
        $$a = bArr;
        $$b = 246;
        int i3 = $10;
        int i4 = (i3 & 45) + (i3 | 45);
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public static Object getRevenue(int i2, char c, int i3) throws Throwable {
        int i4 = $10;
        int i5 = (i4 & 63) + (i4 | 63);
        int i6 = i5 % 128;
        $11 = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj = i;
        $10 = (i6 + 43) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e);
            byte b = bArr[14];
            String str$$c = $$c(b, bArr[4], b);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            $11 = ($10 + 27) % 128;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
