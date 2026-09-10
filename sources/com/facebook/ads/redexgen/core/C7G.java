package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.badlogic.gdx.Input;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7G {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public F9 A00;
    public final AudienceNetworkActivity A01;
    public final C1828k1 A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, -128, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public C7G(C1828k1 c1828k1, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1828k1;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i, int i2) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i, i2);
        }
    }

    public final C0767Hl A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            C1828k1 c1828k1 = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            C0767Hl c0767HlA01 = AbstractC0766Hk.A01(c1828k1, stringExtra);
            if (c0767HlA01 != null) {
                relativeLayout.addView(c0767HlA01, new RelativeLayout.LayoutParams(-1, -1));
            }
            return c0767HlA01;
        }
        return null;
    }

    public final void A04() {
        if (C05789m.A2A(this.A01)) {
            A02(16777216, 16777216);
        }
    }

    public final void A05() {
        if (this.A00 != null && C05789m.A1A(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (C05789m.A2I(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, BG bg, final RelativeLayout relativeLayout) {
        if (C05789m.A1A(this.A01)) {
            BG bg2 = BG.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (bg != bg2) {
                this.A00 = new F9();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                F9 f9 = this.A00;
                String placementId = this.A01.getPackageName();
                f9.A0B(placementId);
                long longExtra = intent.getLongExtra(A00(29, 11, 45), 0L);
                if (longExtra != 0) {
                    F9 f10 = this.A00;
                    String[] strArr = A04;
                    if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "JayLC9GMOZb39CtRqvAFG5wuJA";
                    strArr2[5] = "0wpddTnUpSmY";
                    f10.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId2 = A00(0, 5, 6);
                textView.setText(placementId2);
                textView.setTextColor(-1);
                D3.A0K(textView, Color.argb(Input.Keys.NUMPAD_ENTER, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                final F9 f11 = this.A00;
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(f11, relativeLayout) { // from class: com.facebook.ads.redexgen.X.6q
                    public static String[] A02 = {"kWMETALBgXQPxa1caUNWOxECFuDqqQMg", "ZdkMlJfyQLC9xkOOBWIiDwjfHp6c9jbv", "0ZcfP2jVUcrv9OHIQZTLnU8", "f1ui83cs7IfjD0PNLw4msBb2GPSJERBF", "Csxj5aYvqiT2vPBDwP7", "SUYUZZDjraqMGfRe", "xuktTTnzvvF5Ho58lD7oBLq", ""};
                    public final RelativeLayout A00;
                    public final F9 A01;

                    {
                        this.A01 = f11;
                        this.A00 = relativeLayout;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        if (this.A01 != null && this.A00 != null) {
                            F9 f12 = this.A01;
                            int width = this.A00.getWidth();
                            RelativeLayout relativeLayout2 = this.A00;
                            String[] strArr3 = A02;
                            if (strArr3[0].charAt(28) == strArr3[1].charAt(28)) {
                                throw new RuntimeException();
                            }
                            A02[7] = "";
                            f12.setBounds(0, 0, width, relativeLayout2.getHeight());
                            this.A01.A0D(!this.A01.A0E());
                        }
                        return true;
                    }
                };
                textView.setOnLongClickListener(onLongClickListener);
                relativeLayout.setOnLongClickListener(onLongClickListener);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(BG bg, boolean z) {
        if (C05789m.A2m(this.A02)) {
            BG bg2 = BG.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (bg == bg2 && z) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
