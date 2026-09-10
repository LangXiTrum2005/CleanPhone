package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.ironsource.InterfaceC0435l1;
import dalvik.system.DexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y31 f15115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g41 f15116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a71 f15117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ia1 f15118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f15119g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f15121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f15123k;
    public DexClassLoader l;

    public h41(Context context, ExecutorService executorService, y31 y31Var, g41 g41Var, File file, a71 a71Var, long j10, ia1 ia1Var) {
        this.f15113a = context;
        this.f15114b = executorService;
        this.f15115c = y31Var;
        this.f15116d = g41Var;
        this.f15117e = a71Var;
        this.f15118f = ia1Var;
        this.f15121i = new File(file, "rbp");
        this.f15120h = j10;
    }

    public static void d(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x019d -> B:119:0x01bd). Please report as a decompilation issue!!! */
    public final synchronized void a() {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        y61 y61VarA = this.f15117e.a(InterfaceC0435l1.c.b.f29096b);
        try {
            try {
                try {
                    y61VarA.a();
                    try {
                        try {
                            byte[] bArrF = ps1.F("yaNxj0mI8YelwGOFzdFTHcA4V/Zl8kT12vjpTmCarA0=", false);
                            if (bArrF.length != 32) {
                                throw new f41();
                            }
                            byte[] bArr = new byte[16];
                            ByteBuffer.wrap(bArrF, 4, 16).get(bArr);
                            for (int i10 = 0; i10 < 16; i10++) {
                                bArr[i10] = (byte) (bArr[i10] ^ 68);
                            }
                            this.f15123k = bArr;
                            try {
                                File file = this.f15121i;
                                file.mkdirs();
                                String string = file.toString();
                                StringBuilder sb2 = new StringBuilder(string.length() + 18);
                                sb2.append(string);
                                sb2.append("/");
                                sb2.append("1779306227211");
                                sb2.append(".jar");
                                File file2 = new File(sb2.toString());
                                if (!file2.exists()) {
                                    g41 g41Var = this.f15116d;
                                    byte[] bArr2 = this.f15123k;
                                    g41Var.getClass();
                                    byte[] bArrA = g41.a("8/+/XCa0C+pKylygg39D+EosWdeQOt5ZCORhqMCnwFyNN7dHsapyl6S6FSOxU0g6C0P7ZDGAhKZ4rAnU/sqihsmHKYotscOZE4m36x8F1Aor4Uni4uqBWQZm1Tu7yS5RaM1ZoDyQLb07YSO8sz5/+Te9ctuFHsH6kF6ja4fgcGdr6RqCCzqd+09qwpASHdjJN+Ka+G+6uspsyrWgo39kzfSy41IRBtNe+LkUR3n6Qy+QStgW8Vgjl+ksuNx/aUHGjNSy8WeUlIDGyt9XWDP6mY+SN8M2J7VN+nsSLE6E+SoE3JnE/EN0uMTIScqmx4too8PZ/cKuu8TWysQtI5ybvSafIF63zivRaQOuj9uyBB3WiwxmBAoLcM0/uo97JnBLGAWpNKVmpbavfkMYtcAM6VFvW6mN8t8O2GlksLqUrSenP2qqpMMzm0d0OD3+FSivWdczbpFUAFGGG1QtpZ1DiIPv1PoKCrIbFtRuRVXd3DbkEA5rv1A5IuL8I8W0JayONEcI/Y7rmVRAjQvn7+yXL/2yPtIwHDlorp9Pc9lgJzDyY3xMNcfaX6P7JqVqJzmbDk0V01TUQcRr0pyIvGfMYC1kEDzj+G1tf+asqhN1qVMIYDtQzS6PT4E1bDEcTmetEZzOPy2gQHlrEqv94jqkvR7Nmg/QXs4B9WqR+jYOX8TwB3PHs3YLZqM8lu1pCHQdo4JJp6L7Dv44I/QrGZyrDYLiCF8QrTMZjzezZ8hWgeLlzGGjAXT+vILWQKxT3z7zo2xr6ILrfO/A/HDkjXCwAskS0BMau9bsFH1uq6hLxQB3IADI4+RgA9/kuuTu4041zcgEVXqHXCcXpLQY9s2+rCjpKyUQs5/ibmhV2KqYgg6uhaVBB0ZI+cpTc+XGDThKqqgFmJYUUE5oITI6Isrh+HlrUjxxbXAPwpRLWzAIzR8sbso42AFwzJnayw+nU2qgMem9n13D/JruOOIuMjMS80qq7OAS5qt6QWkcOMjXOjH8sRKyakUp60W17qfUnjMY6HAZd6raCmhHQ5sPFJMaFaeBpwl8soR5MD1cbt4vWvBOioo8xt55h7TJOEkujuvlP7BCss0yOUQ2JEkthzJLj3UEwW/ckYnEf3P6PdvozmpPDGPNiMGdb6OoGJK0LDCdg3w2g1vGZavTcRVGdmQC7vb02kX+Bb7wJ2M+jdyvE4TAHwrFClKntvmhVo5hhpLoh0l7xEGo0AWBDRrKza95RZ8Q2lgzwJHQSDtNe4y6L/kho92+n16+hgAiw2MlIMUW3xeRNUfF/EWorwSW/s6qctdETb2sX9aq/0gZ+iIBJJs30BvMTqVGukfI6Qzaiqo0q0hvWLaiGjXXCD0BuOFcxcSoLX0LKdifdyZxiZDurtKUHyCo6h3iI3A6cj5ctFisx9E3vjKKRnCEcCQ+4zKWaorbFH20fSjNw+Pe/jh8gUKUsuSkA3XIiDX+BhMVAAaelAv3jpVIVe7hvq0WscphuWYDzHfoxSY080NQNFiUeET3BmpRc2B9L0WWt84H/BX01NMMo+d6wJlX+7WUF0xwXnIwYzN8gVl+XLHuF0LVh3d00HbMSr2jpMrEXe4C5jZZKiWSEWJdeMBj3ZiMlaDWDy4sZKmXYbFpULjtndqyN7B+Mv7zKb3h/AJCu1pSx1y2A5hdjFQYuxnghvbQvAQG3ow2k22evNxzr/Bkj/lP4QvYjEit8qZWZR3uS8LDROyC8aquUnlVhEv/xswSm+5CDnJWw/1HauUTmk8rchuqCq14WlzpvYSJbIy3HylswZHiaVWHniPz6QS0nko1039HXGlB1zLaqFd69T5o6vfQB7x1LTs2/OMrxHdR7Y3xuTiZGwz+87WQueU0ppxmODUvdjbg8OsBe5K4DseBNRnftrWH77/KXoyOKsXP4AZ1YqKQBM0+T++lCEy5hw57Ot85bjQx5T0T+Dqi4BqlnbiVjj+iKC+UvYaK9qznWItD4sZV8Y3z0YHFHa1uWZ2iVjKJA/I6XR4nSKH1N2nxGoK5czh6w9koHVD89337+f4EIq0QCQspSRogJHeQAq1ijO8PMeHNXwqF5PlcGrbDQ5abSHySxdUKx7jpjsDjKliO218UsAVzQta2WRtef92GkvzjQixnLJhKmB0rWkRVNUD/4J8vwBHNHjd0/4buI+D4URZYHQzPpCteR0KT9n79hwn0/82G24FKpoBJh5sZuoWgw9ZEyRo/FOdlWLslwwVaUWvna0E0s2Q/fBQPc2FrZY3IrzyRjBcT/iFXmVeh7Z//FjMszrkLDmlXjG3XOuCYgUX2MhrX4qAcDkE+oBLnxno7IVn9G9l8YwD5E8tVaIAHXQWyCeaxvJJVLEnEvo5ISUXyp0Nvj27TLMmHrpZkoEzYu/8VzNlLw3xGzjSg6SnqFLM2Ldo6588/UFyLCdpvOvEkrAHwh98WMY4qt/ZwbTSMqjtQiTGEqwzMdOyxaIvFtO6kK8AFTV6UbjMmN9X/AQJIC0g0xL8XOCkI3CR91UuyYJespCPhU98oBmg+Xke9/Mwa/HlGwOGuIRQ2ceGTClzMrjci54Q8Y4wZyplnFkBY39gxeyKfPalyabC3YCjLF0dYq068XmjZzKGmpWdsI7+PHZCcBB0h9srxlrPG+OO7zblAhuGnprZp4ft2QvpDmkXXmbcfBCMtBwZn/K6LhN3xE9MEEbXmKbpuBE5pIGCTPgCixHMjs7WQchJMHcL7sUWWfZc+idX/TwEUX8CnghmZh9WdmfMlg7Ps17RaherWCPFvUT91TTNprOchWDIGS9C0cr56aqu31AUsxC7iaYsJuK86ew64ltoIWg+XPluxgYHqFULzC2XropdGA4V87Nl15VLgurgP0Pc55diyVFJPST9vjx/dihwsDIjKLYaC/ExrHlHZeMQpRqRRTTNnm5HQ+68qZW926mG/mIsUVSSgmvB0Wfh/XKWto1khyUxEYRnp0voY8sLqFkZYOft7nHBjSedICOXzgoiHuAUGnxb1RXWbRyaszwjDTsVawWzUADevTNRIri6v/48DSSgCtQVmCJF35zURXbkn5q+2FcxVGEiJ1vz5YY0zqHdZrlKdu1/0q8cb9dKmzai23aCMariCRxHqN2KRPTYbbzLV5TrHgT+sMvbShC92UhKk559QnQq53fe4rr5v+lUHizucrZmKxYCT4EcpbV8LAT/Lcv713p8vgQiVYE7uXKDdMzBK4DMbHmElPINo2CHjOdEtGJopP9nFDMXwGBechec6ZIpiKySKoRrPL0Us+T0ZwP42FvzbM+GhbeeiSMjxcrNS64H/rgCjho4xb3yFMuaWdSXrHCVtz3jgIZeil8Ssr/Rhn07Gi9JJ2dm35DPgG7hH/2lZp8DPA3lH7lHYwkF2X8CNGkDBwuqFPYdVLXvLr0XruOJfbjTDo4Jvo2Ibqg1uGUlTSc/iOhozikxtgQ4/QzF/wammR/gmXAb1c7G3O/lQMP9KTgiOJjP6hnFOJXmPVotf7PrU6LaSAVVn57pZhcjjM4EPrvz+fxZUNSlTGkuumBzD4EJfNoHg+RPtqlU6FfY1BDo1PqXezod7RrEKrphiz22LDUThUnU0RdCvGrSmqjzK6Cjh96ZaG9gIUTV6dx2J186GwxeTXvu4Ygh9Ui1APOYRddFM/bStc17MAF12ILRP6eg2oXmFuTMdltCZG9toAEmtbSwudp0EYpck9vNzyRdgTnpqrOZZpCPuzJAaQtOgrZuuedXEjq5BGr0Z5eKY04WfpEhV+PWXWB9EbifXfLsERZnRkwiMOirbpQqurN/zUgm1YgIKkVfxIwmPvmcdtrGlYtAc8+/+6pJ6S8hriSMZ+N4nsznU+TjLDNUWyZWg+WZ1/qvRYjBIa7ewJQtoTtgDXZbHCY4HZvYLBX+wxC3mUXJE24o87a11nTa20eee2QwsEqULkOAinFNJwP5LxVYSGNoxQ3DStxcCEn5TpVgSPM6rIOhfTOFK1ihcjky6/iA7kMMY9myd175RUvdNeQiuXWTLNJWMQ44NXDV+FtnRarG9EtHGCl4WV3qHzuCVZULGKPeLLreLjuE7eiRYs4raLmvxq70nbceYpBnc7aOhRdHV3YMAE4itSRHN2/2+oZOLQXBAGkwzkHodkbfO4ghKdaIpCo1XAQPEvLWuLlP2PA7UYGzVArqYIyfXOtDDMSGxIg+qYOazxSYVTWlESanLbsht5iDRdndBIZEFK8T0NC4ao6V9LxjLqNBcA73h1rSZwbFCcyQH67788r+I5cZDHcTr8n763SAD9NtaJ/DnGQcEczCXgrpeFgLNAQF7sn3Veg4lHNncoe6SeHjyJYBIaqeZNoLNj9yZLm2qvQ1Lh0wDzMAqwWFztXS1OhsNKECDHEigpusDpptvw689t4ew2LlD6hClxt+svD9YVNOby3J2UGQWP0wLX8w4tBLL3iXPJHAjFTUNZhyKwCpND8j/tBzrZLGLwQKhPi9lPOIIBwvHOun0vRkDL9f5fsRLmpKkPbsAV3n9f0BV36smeyZ2Q+myuZaYgSDGKZRMt/m2bzKA65HnqfZdvXQqqO/pTuaZ1FBNnUlVBbIL4dgaCD7B+lj7oLf09bddX2M/dtacsL9MMjpEaKwv0z9r+mgvv4bmFqHpRfR68pb7X1M24cmxsDmn9EIQ9pUhDATnM9y7z6APAAb64iuItkRxw/XfnLsZgzBfsTbgaHI7K4eF9HiAX2jus0TepiBrqBfFtoNnt1ghm02aSk0My35NPrhXI4GkPOip91zl/ddG/Fp+eFhXr0iTIW7ELrec8nNwjk1h+UyQnKGQ736xckVbfdAc25k3NkDjFjd61iicChfj4GvUKukmhWS+NM02y7vQ8Q6O46wS525JOYjvcVdC5E4OPwps/ntbXV4RUIusDTyHcPI+Kf6MBTmJ4X7JOooch+XJIfh7YkejBwQUYFifIQK+4Lz8hVFQP0FTb9yjTVUUzYYxHvm2rK1QP3J0KHiq3cspnHx77ORNma2rMj5I/J6v6d0ZKLsQBgNZd1G5VusWA1auCfGq8McdCesmzq5JqeQcuNy1ff+XtHKnKMww6pH7N71iLQOWrb4H3mXZUyPbR3HPuftakTPV6Yxop6meuRmUsmhxU2bArh/4UrNfnjrR6WoyGJuqpViyH6rJd2Xc1PB8Wt4fFP4P5PfPhQAXmtAxzBVYy6s2POgvpWk59Fxn7n+oVAhqBV0A9ZLzcDAHS1OzjG9j2ES7HM+N3FGwTphaBkDn3JMfRXJveK7h09ryMNQPsoQrym7Nk8sAiQS9QuA/dT3KznyEfDAxzPE3pHLoXjoFRfzCpHHi1mFlNcUuwh0WckKWiE6hM5sIZxtEdgqP2qaC7n1+kljv8U+F9M2J6YHhiq0Q2g2gOiqsMX9uDb0EgjoZOXlEx0k9a4Xhk9kHVj4ESO9zyUtIrwvZl8beftF51qzjhXO3Pes7vuHWHAUELHg+lZ3ocY9M8Hb+JtKKfOuH0eHmVZCSOUROmQ0nDQCr+wtfRX0uOvzOXgatZNOcY+nUEjYkAA5Z1VaA/WCQw+yGuDsu8yhmIvnqQuJHT5f3A55CZPmzGyBD2yWDRc6f9EWF4QZlCIYgjc8n0AnzuIaH3x8uEBVJA/JbQvS8qLD04pBJr4T5JtMTwyiPa0r3L2JDRhZkRZYpcP59inP3rY1XLZNqU1fkNXivBtz5pu3aCjjv4yj7g1jJgvE2wUMAX2tJwbdZGs9XlQSkiaNzqRt3POVRfq++XNVBHrA23iekdRm1boWzS8fOPo33JwBcg40GzjM0uXSp0GGoU96mzgKCTrDdz4jtnbGI9XHn2k1yFxlPQdoJADKtmZqXaVUYmS+Ai7mBNPPQOxy0KlwG+MT+yfXhZ/aJCkcH+J0fylqQWxOtTPAppihL29qBJg53VWYiEggg82GZSF7NaZgc++mIb/whpY4r0AyRQ1YJt+lQYX0q8fpcMp7umBT7hGqBVuZ3mgk/R/No40WBWl7BMu4c5tZPtAyqjTggi7fTI4JWb3FgG3Z9xEjNVy0vrP2bb2JV3Fxf2Ax5PYDGlOV7KYX++11hE7eFSSD6s0M0aN89vpeYFTetzBuSn40ceBmW/TDXgGigVO7KkwuMqCHDoYleMwGX0USeXoJPuDhSSyuAlqs+4X3WEM+449GBu/qzlnpT3vBVUaf8Pv853wRzigaOnmDK1rW8R235INcpGDVAAmKk4niCMvJhw0cTiVcg9jC5j0Exh0c/UJ8beqfbsdrAvwGeCi6346LWAscfECljs/dS59NPno23krsE3Y+bPuP9IdBDYEbKmkQla55SubLAP+U5Y81xlONNzokzQnJG15I8F3nxuIC2RR+ZT8DS6V/GlqZ3Tyr+x/joJK7c3ZTWknCfZ3uea1Yk4vEJf+MfPhKMFv+Hsu/3LVoU5ulfinVNLMJUChGRILEUN6COSs1lixheb6ULgFxLFnrjmRlA8zkpEJnsw9/r3uTy1oGkQxS6Q72Vcq4VOfoIk6n8/iqsdfcnnXNdTPmYwf/P6H5NCCpdwFf3wePHuY9H77T/nU6RtG0z8tzLAby0WhyMdNRw29OYb3Xy5/1AHTsTV979xQyuMv2AEe/4KN9B76FjqXxJJYL+mxpfvJLg70q379tG9V+ntBKGDjyDUweNpX4A6f6hEs1LWZDkbX4gD0KO9qsFXviQ8aXOXG1GtmJkRl2yUvtGEx7OqEe3X2wjdZoXY6by9qNQ67cx5V0e6k39qx8Z3lfw0Zd1wD2zjzMej6ArBi8vo7vbTHb3ogXs3cvlaUiZHNBsb3HyOGT0SYj6og4N7eZiXPZWOxkFVnUBt8BJkqH2u+9pBokmc8cdE0IWwtydF0lKbPOqc0nJn2TVu83/Dd0aDXgmj64IE0gcc+D27PZffOxrulw52WAqSZK+WqG419sQu1tgkYoqV4GCwRo7dq/Yt2v9+bXDiJGGuxdQ014cjbxoAU9O3YfWYmRHgzmBXzyoMVVlYGpNax8HS47+usWN87erT2Sx0865ArY87602pg5nQ+ahDDo84jGMMS8yLuv2JnXsTFL3LCUuc24YozKdBv50ND4xxOTVkyTkYdRTKViL1pN921VHuhrYGFxysMDVV8fbCw60vO9cUB+rKK06P6vW9Gl51kLjfKiNo0nAGVlfUGP/cf4YaOEdV8sm/z+0XQA1oXzAfP9QAnOkFFm6He47WqUD5YiWd2lyGiyAQy67HLRfRXczuYgdqr8KuuQeA67+4FX8uC7crU1P39zwJwH0Oys9LzxPvJm3UhmeA0ahpBBmml7Opr9ENoTz6dB6Au9BZMcuxepA05A/nae9UZRs6O0QnrNbRmuanwCOMhNvQ5ukBD7n0zHZu4Do/VS+yP221cWw2/ZdbzY1GeWiPioqWN5uIj2TQcxvYjYRV/155xJltUUBcg8VC4NpJx9PzCHr+u7AEE3X3oxHfGAw7Sy1pj4ezkIlLftHNtCS4yUGU1fHLPcZOa5D8VHrQZEW7KodgnCoEJqukl1Nx2BRIV92cOGuen/v/qsHfG8rNFGr5KTcJDGEziLXFmNa/yGBpnJURTvjdxza2BVjD3CTxwrsYj/WPcMOl80AosWUkh3TH6uYp9y0iFXzNWURuf4Elo5oxZ+LL6hN+sNjEg8JAiRYv9ToFVbM0cvoJEqDe/Y40tggBZckdFicCJf5N5nKIZk11I+4hejFCP7q+SCtu6Pdt6UWAgTc9u+bMLrzwB9CIIOK3018aCvrFcqxn/HExaQMyB+VpEtEUBrO3pRkIv9qhiflF37LWy4Cf+Lmn3Tm73b0G43/RYxo7cIcLKpKQ8J256rnWx8K1yoCqY8lyUKPXsovD/ijXDyNy/29/YqkZYax7IqPIpaM+rg76hm0ap0fsJ7ibfYZ+BPKUbL+0Wbg+guH2d7P2eEt174KyvZ2/D2wDWd2ZpZW711oUXjsfkR2tU0avkjxGT6eFn9d/7gCmkmKAbbA9IsmBj6qPVFIvdWRjhh2fwdxYcAMdVJSc8najw/0lgpNU11YbjyxSoTMPXDSR0JMEwsmQEp6bXtR3xSi0cafvQj5YG/Y0PY1mtat1k87ncfBDt5UUHsgWmTgRtBcmclemRur42rnzKl/Qv/puO/LWYP1MmmrafHJ1aqTrEwYCVLeLw39FxUw8nOi0yIt+bcrsES5xtw7tLMkRrUWjEQG68S5F/pxY5EZ7eCzuTBU+KtC9+VjV62cH2e9YdgrQGsJhB8fSe15fRevjf3/J7tEve5pgTSAKF9Z4j+c62IA3xYXINQPgipZ89rwPa6zK3DL3oOcDmYPXpHzPQgqRmkpMOn5MZ1QuP1Vm1LsifR6OK/9/8ZDMqPLqdXnLhH1qCMZXe5VwVY99Q4rmxnBVpZGIVHYnxDaKwPY+VhLgkE7A6yXmRc1pZ5fU0NZ10yts1umXinXuHTY9YrmqnisBb5khgnPevjTUxFrJcr/0pHeNGK5rsavfuMktX6ahFIOsD7ihw79Nv3IK7+rocaxWFmKjNCe2jelcy0p0P9IUul6VgvfZagLeZoqoBDAfNSvd3IZVFdJsTNWnbRzUyMpBrbQ/MK4JEH8dcLR3auOHShqkwAOtc4hMUcB4mzooNbKYtcXmn1U6sXkrBlf10nCqeij2Q/Yy0NWR37jTqccmGxZHDNQOZD8tokKwMgftEictmJChZYYdq1NSgi2v6PNShSSsPt+VjfH8C88lb6XveF7V8veL5pQtmIC4Dfj6XUlRYoxAVksLC4AtTBKdg6aIVQAidGthWDlxImjFKAQUg7sByD+4PD+Evemj/WrSxBFVbVm+86185BQqz0XcDQAtPsIJk3zmrmao7wt1MlztL4v2CEmETbqNlIsUr1POZ+agMt7EKXWgikwNY9qnNK26LPRaJ8TtrIqAI4zDgALmTTSse6GQKWPOG2mEeBCCEzRPD3SGuWbzR09L5j4qHAVMYUkuR78IFjAu50fChgWgMIxCDe/w9c+cPg+v8oaXXghLnnsnoW8mhZvakxFeiAQu1a3gHJG1nJSWpasZISCMH8FY/Qpp/3x8oVi4K/Mjq0g+TSL778AE3jrVJPn49z/qc9lcAbHVuA6EMRBIoYbL5YAz1VPWJk0EtB1VnTSpY0Olcm/PDdl2coBg0bLCm3ZV+XTIIVaMHlZQLrSMTKQtr9IeP10jx7xKDr4Nv4moUSLJCl8whAQP4qc+kFarAf2s2Lzqq30x2Ellhc4JzQ6nZjdASYPH9Msrw2FC4qBGK+ttFTC/smejXs++y/APl7kMSyBcMq4KFhHyzv/HIZPxGSsGLbMFNJnP6Y8pDjeRa6nfH+vxEBvkeBBgMutrpGvQSSX/b5qdxq9gbunY04NCcYKuGdkBiAyYFuY1iualuG1YfkvH4K/mGt0+eaM57dUnP7VuJphd1+FIAZXcazLnbfkW3XvD7jIEBLwWDqbpVWXPwj0jcBGnyT2GkzbmeuAbPDtsN7N7uma+NFaC8D+fBzRYaa/PGngw+EDSwlpT8MXIaBs2ZH2Xtdou9C558OXK2HDztFXH8Ok5AEy+BQoddp/jEMNWkUi+f6QLTEVv/nMOoQDkWSAp8O+nzCMJDBaxqOSfv62ycz1r4HjYfv27/Vs/pOJyvsg/bNrzKzZJhXu+QSMcdLyBh9druM6T58pHZhFcuZxU1OR/JTYSTJ824Rl4edYGTN2Xhr/wZM3NN8ATfBqXK/XfsNJuO0Jvi3m2l4PdTqPSQpJVAaAkdahrFazldinnThjduq9gEKtOGqovYTkaaabuAYx7FZxnRsTxLw+3iLwKYZnUA8v3ocR2LoUpE5ipNHWPkrtexy47+UYOSJPb89mQ/1CP4IEiu3N+TnvtfR8c08AOE17o4kfB1NbOCCyjT2C4A7GnsH+oRrqVZf7RYmIJeKHdykXhjfPjGTRsVHMWLUO6X1S9lAq2Apr8Z8gJ2S+DEtnjqunXNkqk22jazR69mf44naFMsc9iV2qGcKOFsxLVd/c0Sz+97VESWJCW81NmMY4exCcRKUjFva40h2FlZdJrK4bRHu5Qh8oiKinCrhDAPc3Afk3XIAYGk0rx8rsoeSnKlB6mo/B437cfDPTqdOXqYubvexfMdrdV0Y8O6zKO5DQY2ARARw5ACvjivSUwJR2AVbGo9QyhRjpmynrcjsHLpxK7LLMVp42Ym+fzg+KTmzpiN2MtURV7+5cFIyy/3RajDSxxu9Mmy13APMuRPjOQZVUrCu49WlGnnTU+dXt+WxjdKp4qyAj3Nh+VLdzJFHDCY7seJ314rx0IDmdDIRIKnN9QrNwnE2Dm7VT8TwHEPrOBcK/7Z1CpO8HKAp3cbR84t/S8DOtlpZB31yoX8dlVvDow+HkMFSrueC2CSWZlIHW9N2b4mtE1hK41uQILMpPFopGPmXrJGE6HE/GK8kMSewFEAxJtLPs5n1/pWBKdsytrtjD0Ah76rOtPzlzzNKMqwuK1YivICTiQbwIix1ALkklp04UVX8AHrBjTUBVLUp68SYkZX+tS3qGHio8aHVFzzrKh4wsmpmdtC9271jJsVkcW7zaU4quaHsr4+IOz+CN5zvr72i31pE6VCk8wpT8n9q7nBwI1gm54mrJgb1UHJ7FQCSnYN7dbd8Cj9QoP9jZBsJCghOe/v2b//t9PJsoAUxHqeZAbe1oudLgv8kj+psYcqjnNGeCFbUVUAsKTN8Qlv12xFcCFmA5p9mWRgrYoNkXPCSDCf/u56m40m6Rtc4Vm5zpbYBefFnc6drlq5F9LIUVC4HA0KCuTq9eDoJSlST8dnSVNgR/nDQPl3wTNEiYZsm8B35bH7yMUNCKvNMhRGeV/wYgxrfYrPNILPs3SpbalqPNjO87BdfB9zqV710my8JUOFrlRUG8L2Ia+kqs6gV//xG7nC0ciJy04PbzFsZyh6b+lPuWvnO1z6mtwyPvCDimWisAYzmTug5IKw0mWbZJnet78W+E1UbUXmfMSvXF62ghSSeebCncX+UN2V7pi3EFo5Db62j+nCA0WtPlpSlXDAuTqUSH7W41YFSmMv/d9eO98E1+2NKIWwhOc/lIlB/8c9jCNwIAPj97eoBw+EAJnZfOgliY7zm24RH7fyLEYGJCsr1fsTJzgfpLkbu27HRTmQnxoj3yxVRqqMacS89nSqiQdvxLKbPhTeij66rnABgnjUGTaLFNMhvTAf74IGokicHUv8Il5m1jmwpT/AQWmv1iQbOeWtXlAZfSsw69yJKsjE5Og6/ZsZK9M6qORlGIjYFCFodx25j+rZMlJdVdBOg9T+dxd0DnnYlimwYQB6suLgI3rjRtDXp/yZB4L44g8GVORH5MVkO1oXNuc9I4MRdOGun5MZTZXDNfEQ6K1o6vLGoiR0oyIICy651NX9oyK8+dpo6ZX7zcrGMe6kseJOE/tVtI03xdI2B0nxf7LikFvZViKScYLx3fbo1uGrujh2dXV0gEvn8WRxEWLs3bX+q3AirbDyWNNMKFX/TUynRyNwZppdy+X1jbkrTSl7zI5SyweYWGTFObeFZ27/rTTJlSPKpOnMEPjjdO6mEjgIw8cUzWXmHURh9A5MPvvy73cAx8khtziedtCr1n7hlr7Q4gNpjCXUIGvd8c19YfBrfxGt4E4fHGbcbe+Om3ohvOtgXN+CZT4+VUA0cA6Izo2zTHPIN5I/aXakKNNNl85MbFh63afi9JqDWUvvDYxNk13T14jqN1cJx3yraJgiwrklx7RYAdS7Gmqj8wzRpbRB1w6iFzLRS4CAymjA3wFnE0UyYpVCWa21E+/likNbnAZmkfutGqpb7kTKaZoyOe5ljyXsTRnwTyA86vNjEXVjC6BJkHbToUAPMtzksKqIzM/FS4Rcidl+UeeAcf2aQ7f3USkyUfvrAFdDLWlNz5MtgpPMFZpbgG/24kLGCTpWBZTNIOhGQUhhDAUkNb/RFK1ZOtQYrMwY79nTWLiW644DkIGRQeHDLWWYJe2J4VC9Yy+mIgwBcRDMtUluwpakZeiyRztpb3t/jxSdBRcuPWV0P7JevlZ6Bnfon+CkDzaPuYTzswG7BYyImht2e+EpBo+ka/6RMIC7x56WB3yC+5T28cXtZJ9Tbu2JzbMwtkuZgZVOEinI6vRi2MGSLvcrmPBREXtVqX3liZaxwKGpjrjEyY9IouXcod23SeHCNyejK7fPguU61tYPL/bVxR9AqptldUyxBYPjhk2WQfIaOqLJ4vOoVgjzDl2koWDoZ32+CZUn1p4wa7+mVYAe/uUjx/AGZnt2KTwvxSJTjwmBZWFifYCAki5jnsnpmKssq7AEcPTdk+T3SzcDgz0KTavxodTdX7sVq85v1yVFFP7J8LwXdQq4+ZvJ2xgcdhOpTMuVajuEMbYfMenRI8fV0pNkFKU0dlvQzawOqO2BAy5kgYKt/7kT/UDHN9fhAuhUszybTSXEqE2F70NjrHMdLrH9ARJ9Lk8HSvEnf9g57G3wmxkGAvgfK9wgPS3hAhbmU3bl2I1kLMMfeg6ow335fh5MUvBEBbIBUZnxaLnxBTUc7UMxiN7TxxaAE++rRgmgsDETiOfIrrPhZXRwXMl1Hits6RWwtIiNRfPGqqd7925ziQrRoDAFpLedS5zWTxkzxkdCFck6z0i6VdmGO/EQaBjxhdk0RdG9xboX4CzSfPNyULY0PG5wtprJ6RO4+CVcHASg73WgTEteXvChWfcEh22Cst5IBDbCSZMhOhxsDZAmemL219QHzMNe3aoBWW9TVTZyNuuTdnvlUxX5BpRHN6PYCPdk/RmTit8Vp2HK5iJoJ2Cw6QP4Adg+m73zMPzRf+Q3oqZkXkdPYk0HAzuNy8zlmCRVmMaNIA1huWQyZodS+PfZOCo2KsJwhnyBiib2bfy5PNBAMXHXSGaA+A39zj+eQZHC3un0YPsIz+fNwzBtMsJsu2wrbwc41zyLx3gtByPZHx9QXVPIfKCCfVB21X0jbFEVT6g0/3FIQmVDsJxa460YrE8JQGqopkz/IWvqKFipmcooI8uRcTAH+izAW2iP2grYaM+dIwGBZaC843Kczvc9sH6In+gyJ3pzGA/M9k/2ZBJVG3Ez349H2MKM9OCn3hCBvTFEvCXRvjOJ9TzH37kxzQ5QTJRvJ/gEanY/pD8zgjSVN6MX2IBndz/YICbNcvrUTPouFKRegiyfAVgNuJFMH3sRSYUARnsp+y7M+hQOx+i54QoFPzy1b/xnsh9tkDmWKY1FqFAqU087YCUYZ3yxEsT5ZvzgEmIIWtQCt9eZYJQ8AfzFHXwHwchTBz3E+Ibqr2E6A4SKfOhS3cB9xMuxhb17oikBeYOC81SIrMqJrEMF+Pi0iHYDZDUx8vliYWum8+F+JDQtMRhDoMaL9OxfPXCjTGXUZrN5kDpusaZTShNQGJ1Vbihl7OaFoJONrLJ+b4PfTtCy/ANCO8VHWBQcymPworLfpu5zAJ12WcKi+dGsOojkKY7+Hei7SDvaBTiS0xoM99T0RtbmacqL0Conneurt7GQ5HBHHdC+5oYBzyaa8E/wLbVUX1MnRQ6Wrzr/uKxPoiLtvlvWvmvs+WnlDkyfFHqHd/Brk+6T2D5L70W/ct/XBMz1c4zru2EZsBALipBoUBvAEGzX6fDH1Tr0x91q349Nk8ScItLT/ODe7HF9GTMU2Z6bQ5gq/GxN7mElpXUEDAIpds3nNqnC1DuTUo8yAUhYJN+Q4pVzRk4oEJHUSePIl9J+ZU2w7V4uUuegZ2FCohtvI69LB1WQ6HAhcbBpx5P0cbpeWz2zapOELJkPBXPL5gQVfWK+h2b1B1DLMmyX3Xz7bUb9B6IYAiGPUsufrhbprfFpS2PLXkqEViYvp704Uopy0BbN1D8eyPpdGPcNAVjtviTolKQJmTrcvP728UiUDiRDFv9abqHAvqgGUfmI3bOFa5HEzod8mS3XgpjtzACZITfcCn7HELzxF6exHFjhf3et/Dju5R95udYP7oTDllKPPVSRhxb/klrSunDp9y6fqRFx5EiA4f0/JNEUkJqqJaxbvqt2cBMvD9GYbgr6aM/OAKdugaXGbSbJOcXhPBxmfVkWsIGKLeTciZd0vc18nOvOEOYUuzYS93kD4K+Vl7wWoyS5aOmsWrsGIbeaC22zEHxC2k7tHRSK9fsbVwFhrJiMZV6KhtH1wb1tcW4D0c93c/Iav8aVPa6uj8GgUdW5V0iKvMcLTAaLr+krtmHobUW8kmjM/qJyzInsCXK9w9TBtttO5tREezwb8M9xPriLE6BMj1t5nxugZ6x8IgHs84BB2CEO/suaKsvHVEihYHZRgzTNOA7gOMdt2FHLSsZjhCDGd6R3iYLqpeJld2MJsGxrEUJvBuKQwM7SwBlzKdZjcNUFwZTquGuhwuLgX3EhqYjSSToq2SvFTBIHyZeHhcjF5SilpICpqsSVP/T/Nt3UGOuBMYS+IoY64MFeb52oId7HpNJj5vpe27syUCTH8vtJgkzELGz9vBF085EFzDudA1Kr56aW/5YM6Ott9KWJIM+agCRTLH7Z9vDV6tAMKVjoPTxDUj1Fpg2Qqfw7O8ecZugdMeoHnct/mYeh2eSoEzjwaKyRy0eqJAmlLJHw/MbcyacZj+CNEa28NJgBVqczP4ra9I+rHtjOPveoW8WCBuRGsGVupEkw3GoALScK+Bahhb9seNoixI9WdqwcM6l6+Ruod4mH3/CQJ4Xr73/Ny4LMCCiS6uunYjoMmMz28hxF+/Ct2ReEs8ZcI8KD24jXqMx1wExA+wYcblMuZwLP8c5VI+MQjFfHjWFpbEPqYDCwIrlSnVsKSBdyKzGbSRb0dlqVwY4QBo8yrtJGs7gaHWkSHjd4NUslcwWLzq0JrhgFVfV/rs7bVSyXULiipnjSi8vuAVfDVaITOMf8TZxbe+H82Ag5T2zo14/AuKl6/66Clla+0GRfjq20E0caJW7Lalfgcqlo8+bY2vOOthdnHVWOV1nLBBnjk+jN6YnaiRlNUTWD+k4kCVspFogdj4ZAukNpJi1cNNFr7p3xiNwW//4iAwTNQmn59Q1uCafgtMRKOw2pE42JwAYpO8r8WMYWjVEh73wnZXJxUkp+9Vn2zd/QjXZLbsaD7TYfekva9bVqe9Bfz2XQ/+rP6BoBLaiY7OCsLMClrKMUdGcJrg1R8szva48gFlrpbV4jVjJ18qC8Mbv0PYE7MBbRpex2Nj677fcrVYAMzZtUUOw36cKU6VzBjw2rCsG1yT2ynTG3IYCYzFa7stj3vdtiyH7wvZGybnHhYpddM0E5MHaNticPfEcKGOgCPLT6Ccw66ZkAPn1HUWSRJyM2aEAy8ODtcZn8l3Q5mJBQ8BqGB7GlQx/wINnq6gUDwG2LANrUfl/Kg0L9Q6Z8YENvaMiQu2TPEs6lamf+rgBLQd/nVowAQsiXN58aQnJkMygXq6oAsEkBvc8r5epEuX/I8MRCggAS9Cjh1FtFGQsy5CNjvhPO3ZTAdniwNMH15CsYxSQKBX4lNMsDOKOdhIn6Gxm6GVzbIIefO+iO792uYMCB7pWne4Z9BEYwdzDdc5xrH2hdRd902CLbOmdijp2GF3OfsqREBW8CoEJ4tqv2kA5wVQw8ZSvIbXl4w1kdU2l6AwUty5a8vuW1XnakVuGo+9WhnNHmwfsVz1Ktt1UI4p4y3+1WD6hiPR1BXIL9TvERO9/lLMmPdYL5Zfa/sN/EPtVNcH6gubjVPE2CQmc7gpsBWxOYh3IX3vsp94030tcRhTejdFkpOGwtPJ1ro3vs1q21YImZSEEWTGrFFSwkhpXqZuIFloNZlQzAd2bjgYPWtMDPhtbv1VgQrGNnVVZWFitTSWmEO2k9UOPnu4s7pOOeU1QWGpSpESJaC8HKxBI4doBQZqH9Aw5e6AmhhzljtLKTr0jCLia53aVxsQ3LZwhHeOcYidWYU/v5dfdhe+Li4Ztdex35QsmQru3I6jUonB9LnhNd8zdG4JUIYibdttrTR4CiEhhW+2/sFH6CgDhJUiKDXJjU/GtLynTegaFimGX3GKWHd4XXF1lQbh08BIEfX14cWqgDAHc5crlObF8zIXYZRXh3AzKx8WF28ua3tDWwBxLDBWgJGtDkTWCxh9/MF3a7EbSxw7/hm+84MJgGKUaLqzuocM/TNeATM9IcSZZy3R1FwrbHjS0QmaYPVZ7spW+xjHVmYiuKrA8cvS6lNxyf/rQZjPCdkMzrl/AWo6cwggT7ZL+2FFkkDEgv6MQD5drRjSpsP869BBa+hWv/2niKUNXK9tLt5wzEuuKW1NsfsUou9vQP6wRvVykrXsRIDAGcVXPCX9DakyYAk3eSyF8XORRPD1icjw/J8ijQlGmmrXok6+gziC93kWgqsREn2GcmT2CqTfQhqORABx25qFjKptpqPAXuRlwygja1e0D9YgEgEe1g2FozUk+hTryrd42QbBLxk/4k4pX+qzjTHDAF026VEzX2NgtvyLn4S7b/mc5YUxEXj8iBeqeRMcfu5wX/75eZ8KjgaHp/b6YKag01uIODxigcwN214XxygOW2dQ2j10Nd4Un2qOk7AJmucAyy0TXwPiSQWc6HSTYBBHMWwJSUYD9s4oO0CEz3kagBZi5kaMW0XdI9+JUpdBkGeYW/S6e+T3MZvYttrrgm8byMIXgjMBIS9bmkAuhLxjWifWfBELRAnSzZLX/6AXV0adhNO1cVdTwKOYZ0bk9BDzqO3wEN+Hgype9rZUCORbHGuQXqyvYtF3j2M4W95+RUWpiveYaiqC61ZKf/dHlLTdfbXLcHt1pyz/rzEfD1l/yTYS15A94F3eM3kGG/Kwy2gdVSidkaS/2RVK0NJKmLsqszcfRHJe8QcOhM106PVdpkA3ahnmSenIKmJA5rLVlXKINuQ1KxZIgnsN2gi0CgtQYOVDtqDgtHYYwapD6F4EnZuV+mzxvtrguSw3liV2lAWwl3FsZFTXSbAftvkYHexwTb6u4jY39Bf9oY0SLlWc5R8OYQyI8U/AZvzFAJfz/9Ha4zzczHyR1oXKYc+yE6vlmcuK0CItOErrdkWe1FfROR3BVDksMyNaD5rJTNanDOfTaUhKfNSMebdSJo7aVAaNZCoc1I6rkM6Ab6HTYlA6IgP68Objex6yJ0alvLSflBR1yeUGWzqHU7pXQt45epiOuryVCcl2dgnyTSCfkld9zDwhY2wXQszoyv0bsjOmt21fFLLnONwmc1zwMDaqSnX/EwW5MBacMU+YlDie1wj2quQb3TCrsfTL2MjUK+UsHV9eHORwRcUx7Zn2Wtd23t/Cn/o4NbP8hiWqOhgH6LbeJdt9ywFS0+xE6o7KoMJwIWxko1wD7w06xYgr8hQ6hpktN6BTp+HR/33A6zNvumyAA/xAWLDqfrOaBdrzmF8Oc9uZzLPabUo41sVHAyzplibqL6SAFfutgZ5MvC5NLP9XoNNqsYe72glFydbqFiVeD3jVzrfp8tUw+2ZoaBN0v9aXkw675+Z3bZ+57lJMObO9toq6N7GuANNtsDKZkOg8L6/Mk7HCYb249e2WbVZrVi6HvZ0b5nYjGHLKm3jXQ/NibnXIBl2C9s8pv2hDptPBCEl9YgI9juC9aDCExkuUIWAKX5S7AuEZ6HXsgdv/LVWP1FqGzatwi+gwzcqJ894eRh1MGiFJSr4hTnA5XU9obpk7W7yjqLILqHZ5NomGTvwK7mT/SOY64oQZxIJ30cKoy+1kQQkGNtlZWMJu/YKX6PGCx+yFz3MgIXxj/0xtOLxfM+0GDQxl2GDZFRyOmjcqkfTNGf6NI0Yb6ajsvir54gw98s51Hp+CZ2i8Tce76tbAyFpGTwWz5Pk99nbxGEehdrncGrZ51ABZEIWREb1Y3Tzx4wrOxAz2pfkV4AdT426ipG+A3T3RZKrsd3txA35gJ+Z/vLfkqo9Xjzt5X6IZqwE6H2l7FI20xMwacbmhHT+kV2pfa/5q2sr60wgjcblM/Pk5Wkjf8PZNo/3pRavi5mfdUx3+HOqr7ZVYMwBCTMPa8f27nsKLCiffmVmUw5ejCM1ufIEfhQQvS27OQokCej7lKhrxOOYf5XJwz9RmAX+aYy7idA+IjGZgzzH5x0AyfcxmDXxzAVNSAuGOC2fbDr5PTuTL6LSBxiVK0TgJrEv+A71u6fYYnwDp9swKbQuRMJ3mGv0t2bsbKgPW8NHW0XaPdvOXhPF9EMCMAYPm1CyBVH/g+QM5wvuF26uHLwZcvZYd8DmTJJx8vgwlOsYhZmWqX+wYn3lvQ++nTLHopL0NJ2FmIOjgM5BnrzgeLswRdUZEnVX1ArDGCmNigrmtQ7fAex3eIRZ7AeqsRMYH7t2Z+vyXLp/6if7f5f4qyUTk8JtdZcVku0Bvths3b7evkCh797/5QOlgaAJ05f4b/xXw+YrfyEK8wxzSu5FXoxLdIsOXiWuToIv3ycoEn8T/bgoUrHDWMlQYJv+2b0NvsFqiXqb+vQCCvyVO4qM5jBFjZoSDa+IMn6GfZmtQ1EtJSGrL26Kr9erqg6/uAnIpKZH/HWe33HVPHUFEaNBBY0m+/UJ5TWq+hm9t5heSk1ow5pGUbrx5VNoPaEcUg8ftfrNqCmN/CS2W05ZDCMxhX3olSyReh6q8B/vkxP1i08zD8OAzhzpCN0DKkIwD85TN/ORV7pJJ3e3gLGlAPEE5+GLqCBxJGdW5a52PF4hG2k0/FuwHbNs7O1t9vakPCZYRm4QrtKd+caW4Rm026YgTDGPXXgbg9uyJPqRtKNyf8s99CHi/f2ZfTYYDw6YiqpgmfK/mH9AY0FY4WD+OJYy4ddqNCDRkUiU7hPno11Ug4bMGKshxi8WUv9fr6R/8aA52a/9p8V7VnBfi9tgRDl7VqLjFscv31QEBKsbH5KQ7FUOfDZ2h2b0iH3HFMZEQR9VKZLIewVOVKpvQW4/DSmqowDIJCJYWKiINwEQAVuqsaohlkJSwSdkEzaLe9PHaezb3phCS0LHmccuJ1dl4pb2HP1DZ28VJjQDhAN3oLieGmfZ3H+G1oo7GtMUh8ObOavJHeUSRf8wtDnP7u+8ITYJXfEDR+PI0c3g0Jk5eD+9ge53wrBq9vl2ZDzER01yXrxgmIPqnhe0tVamToTQoQ5dryC7fKawiOhIUNNpbpsU1EHDRIlXikjkENaX5GidHG8g1bZys6i2Ae18cqMHKecFOYvW6l3dmGm0BRuBFkyvclMKyvns6tgF2cFxQ/qEuI3V8LPWvqGohbJYhPoY3/StUG1dtN0FSG+11WnBvQYS/PGYubdbhRIohI7gOfMKvthLmUI6uU1sDmQ4/Sdxod4Rt4ug3Rrlz/VcXsuPAD6URkkYf3z2SxX/n3OuPLhonVP+nnllxG7iy4NAFVz2ky8TqQwnl3533ydHYftYm8O3gybW65gaRKmMKsizYzHU+WDY/BQAfAdP944lPNDFL64ICgNBDVG7kcN5LHmpetJl0OKYtR3BeL3OPezDXxqxa0Z0qrAMpc6vCsjUnpZ/PvvnZwvs6UtiG0XTKUs7V85XwNz1IAVpVztbagHrjWKst8Bgh4SooJjUKATswYysOnVubGWcrp66CdYTcuAO8o9E4KxcyFulZgk/nzMPFbzTWkSG3Uda71stkdNk3K65+kkDIyDq8s17bkvDDF/in4AqxJUBLNZ4ZxdeLoZoi3SsASsSeVLJR0dUUzezKnamCFxq4k7+kzIYsZz/WJ65MqjdYfViB1FBsi9ACMro+bzXSBYpKus+KkdXNadekcICT4LTfEr66q6QBZ1QT3oSxzSqFV0x5MkqhUvGOikkvIcI1mcq2HbcaisIn569AHBkuqEMBiYHHawG3uTDbIalrvSIThfaxbYrSWGMcUk+PzrCjdmcYswYje4h5yIWFzQ+kg4Np1FxQp4Fo6ZEEmgGTlKSpPRHYvSRz7wlyqL32pkCRyTILjQ4MBH8XhEba4kZ5OqqCsKezUM2lOo6LgnmIdQFZRjIsahzu6M8J8XVVveYCeSXtvlpNPRYeRQWHRLAZdKnCB4vny6vK+qpoRn19WXR5VPPvxa4P+aSDdDDHGwNJBsExC7RBe9TwsKLvjuNXJnQVYhR4OsUIqPKcaVDwiMm9pjRb61Cnh9J21JOlMD4A8Zr54qPQl+VYyADYjAmJUnZY9DpHZL09WSsbzG3T9BiZ8OOTbj3mTgOSTjpiblUqHuAFJE8lvowDAz5fQ6YyFiOB3RVup29Y+785kphVMA5NUU+iYllhIiGtn3MlL/hjvtdWF4XwGBY5aNxmXPboXKBWXPtBGRH8HJLcfFWDOOHDQr/Wp+W8PvQM6jIRbcOojxkgvEbpcckNvImmvgTsL8MR55TywKZqX2YO8fBmxER75kmTiutLMFy+0GsHlgc+3JCj2g2B199YMrmctXwNouBwhPt5KIPF6CXOb0J/UGZSLcSeJ0OXrmP/lX4redK9+X20qdPtDHJWAEQcmALvKfvTm7OIQ4WYbCG/ND/kmhv45ALyqNAkTF8vxxdUMSM4b6wLt9GsjFERPtnQj6AHm99QNIRfGXzobgqyVuAtv8uGZ3CY15khKNL4kKXweo5248atqtx0o3E2pz3QHH45mQhnG0mtwkd1t57Ep9PTIhHwjvNpPTAXTksf3BbTGJcqOIi98lLnY4dfm3YTXwszrRYdYxQ3iMdS27jLO7Y3Y0P0JDEsUfKreMKcqGUHITYRPftg4rPPlL6dVLgHmXBg3TLt09vn6ZO3SKS1BuI1l1cUxdloL+ZOuRv0SlOja2E1XGGJxsWd1wONg1YNa5e8QK/8mnwR/MFyMyV0xEzU+PMWMvNQwGbYdMcrbN8Ja6aguIl8JwetmBSi7NU1pd9yTUwRIRMeeDI1Gaw/k1+oME+52VLicIUfd5GSaxag01l1+UBp/2MuD4ioA9fq/PCB7nLl57O3UkD5KoA3IYLhY7MiK8hOrPKzh4ul2+Osb4Bc8EGrG8nTqni5uW2xaMinCq0EHLuAt8HvBdZ85rL8B5mkFGa7Fawpygfc1SlFxPge99DUcpG+6aj8eRIEP5ZZAxSnaTzONzWrLpMHOYC8kddDzF/V+nGMBhaLUWtP3J+weLl6ZMdrrDQNixP8zE0uRPiKXEf1jCZ7y4pensLRTPu9refQaN2BOQYv9e4Kbq1CWKWQxTwNm3uqUfZU9VTPR2YnIZ5hqqevpvM0gRw975d17c9TdIhfXNBUBoKFOBEPhJD6oXGLO+FUX9EqeDHlx2154Q4Ml6ZqlS/HLXH/12FZu3gJe/SdXo70KnD1n6bK0In2W8NnlKnJ2EOkQWD+ZvPDvMagFB/ndsXr5+CZGsLTIQ8Geb3Qc5OgHGMcWCIDMZuz/gQLbyJiX10shU/U75hduD5VHk7QS5WfTlJez2Bs0SUJaZbyuolj0sVXH9Cs+thvowaRA67h68thEZeITf5XUeYmB+hjEo2cAgP/zqkZKUeSSTC3xi3+9foS34/NfQAMrcwcyp/313y4JcDIEFlgvdbW+CyisaK6hP7Y1/eeyr6T3urtm5281CVq6izfkG4Oe7y1/B9uMacVNxr08d7gnAI/5AJi1v1si7TKPHGTXSYDcS44wyMvTgPRJKwZpuNh7sdokvt/ix40A8KjHU7tMCqDzvlInCbgwsuZu54uR+zoE/BUnvt3SwLIKsVCw0KfN6xQpdXwTVyhd3MXHcIoRKc1PcYj97c/0leqeSoytwheW+Mrnrto0cIFaWPOP/TFk6ZEp8R/OucAql8MFxm6oIOtG6j954tt37gN6eek9XVIa2hgPjj6igE89PYGvYZ4eIuigdyfWocI6mVpBPNopiakR0bOrfwb5J4vfEmZOws08veD76YZFIPTP3H751X4O+HdVS1QlobHOa8DS+43ICxXxgahgmQOMmsP8WP90MP9jKgA3aWaLfqTlRtL+8paZRH9h5r6REYuxvETYxI9ZHeDIi9ffmE07hO4TteNSWt5rWlJ8KjTdZbO809S+D1bsfBy3wZrYH/4nbgK+XJsZ5kJKvQU4cJBnSKLVU6zjgGM0O12XlVdZzgrsJnMx0EG8B9JhccfCRiziMM5A7vYaTtmLM8QznwNmzQeAqA3GZEcsub73oZPLHEJ5o4Vvx64lC22sXuXJWTdDlQUoRzal0bCdzk=", bArr2);
                                    file2.createNewFile();
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                    try {
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            file2.setReadOnly();
                                        }
                                        fileOutputStream2.write(bArrA, 0, bArrA.length);
                                        fileOutputStream2.close();
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                                File file3 = this.f15121i;
                                String string2 = file3.toString();
                                StringBuilder sb3 = new StringBuilder(string2.length() + 19);
                                sb3.append(string2);
                                sb3.append("/");
                                sb3.append("1779306227211");
                                sb3.append(".tmmp");
                                File file4 = new File(sb3.toString());
                                FileInputStream fileInputStream2 = null;
                                if (file4.exists()) {
                                    String string3 = file3.toString();
                                    StringBuilder sb4 = new StringBuilder(string3.length() + 18);
                                    sb4.append(string3);
                                    sb4.append("/");
                                    sb4.append("1779306227211");
                                    sb4.append(".dex");
                                    File file5 = new File(sb4.toString());
                                    if (!file5.exists()) {
                                        try {
                                            long length = file4.length();
                                            if (length <= 0) {
                                                d(file4);
                                            } else {
                                                byte[] bArr3 = new byte[(int) length];
                                                fileInputStream = new FileInputStream(file4);
                                                try {
                                                    try {
                                                        if (fileInputStream.read(bArr3) <= 0) {
                                                            d(file4);
                                                        } else {
                                                            ks1 ks1Var = ks1.f16518a;
                                                            int i11 = tr1.f20473a;
                                                            ne neVarD = ne.D(bArr3, ks1.f16519b);
                                                            if ("1779306227211".equals(new String(neVarD.B().h())) && Arrays.equals(neVarD.A().h(), this.f15115c.c(neVarD.z().h())) && Arrays.equals(neVarD.C().h(), Build.VERSION.SDK.getBytes())) {
                                                                g41 g41Var2 = this.f15116d;
                                                                byte[] bArr4 = this.f15123k;
                                                                String str = new String(neVarD.z().h());
                                                                g41Var2.getClass();
                                                                byte[] bArrA2 = g41.a(str, bArr4);
                                                                file5.createNewFile();
                                                                fileOutputStream = new FileOutputStream(file5);
                                                                try {
                                                                    fileOutputStream.write(bArrA2, 0, bArrA2.length);
                                                                } catch (f41 | IOException | NullPointerException unused) {
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    fileInputStream2 = fileInputStream;
                                                                    e(fileInputStream2);
                                                                    e(fileOutputStream);
                                                                    throw th;
                                                                }
                                                                e(fileInputStream);
                                                                e(fileOutputStream);
                                                            }
                                                            d(file4);
                                                        }
                                                        e(fileInputStream);
                                                    } catch (f41 | IOException | NullPointerException unused2) {
                                                        fileOutputStream = null;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    fileOutputStream = null;
                                                }
                                            }
                                        } catch (f41 | IOException | NullPointerException unused3) {
                                            fileInputStream = null;
                                            fileOutputStream = null;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            fileOutputStream = null;
                                        }
                                    }
                                }
                                try {
                                    this.l = new DexClassLoader(file2.getAbsolutePath(), this.f15121i.getAbsolutePath(), null, this.f15113a.getClassLoader());
                                    d(file2);
                                    File file6 = this.f15121i;
                                    c(file6);
                                    d(new File(String.format("%s/%s.dex", file6, "1779306227211")));
                                    for (i41 i41Var : this.f15118f) {
                                        Pair pairCreate = Pair.create(i41Var.f15571a, i41Var.f15572b);
                                        HashMap map = this.f15119g;
                                        if (!map.containsKey(pairCreate)) {
                                            map.put(pairCreate, this.f15114b.submit(new ze(11, this, i41Var)));
                                        }
                                    }
                                    this.f15122j = true;
                                    y61VarA.c();
                                } catch (Throwable th7) {
                                    d(file2);
                                    File file7 = this.f15121i;
                                    c(file7);
                                    d(new File(String.format("%s/%s.dex", file7, "1779306227211")));
                                    throw th7;
                                }
                            } catch (f41 | IOException | NullPointerException e10) {
                                throw new o21(e10);
                            }
                        } catch (IllegalArgumentException e11) {
                            throw new f41(e11);
                        }
                    } catch (f41 e12) {
                        throw new o21(e12);
                    }
                } catch (Throwable th8) {
                    y61VarA.b(th8);
                    throw th8;
                }
            } catch (o21 e13) {
                y61VarA.b(e13);
            }
        } catch (Throwable th9) {
            y61VarA.c();
            throw th9;
        }
    }

    public final Method b(String str, String str2) {
        Future future = (Future) this.f15119g.get(new Pair(str, str2));
        a71 a71Var = this.f15117e;
        if (future == null) {
            a71Var.b(302);
            return null;
        }
        try {
            return (Method) future.get(this.f15120h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            a71Var.b(304);
            return null;
        } catch (TimeoutException unused2) {
            a71Var.b(303);
            return null;
        }
    }

    public final void c(File file) throws Throwable {
        if (new File(file.toString().concat("/1779306227211.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1779306227211.dex"));
        if (!file2.exists()) {
            return;
        }
        long length = file2.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            e(fileInputStream2);
                            d(file2);
                            return;
                        }
                        me meVarE = ne.E();
                        byte[] bytes = Build.VERSION.SDK.getBytes();
                        as1 as1Var = cs1.f13248b;
                        as1 as1VarD = cs1.D(bytes, 0, bytes.length);
                        meVarE.b();
                        ((ne) meVarE.f19193b).I(as1VarD);
                        byte[] bytes2 = "1779306227211".getBytes();
                        as1 as1VarD2 = cs1.D(bytes2, 0, bytes2.length);
                        meVarE.b();
                        ((ne) meVarE.f19193b).H(as1VarD2);
                        throw new f41();
                    } catch (f41 | IOException e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        this.f15117e.d(e, 301);
                        e(fileInputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    e(fileInputStream);
                    d(file2);
                    throw th;
                }
            } catch (f41 | IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
