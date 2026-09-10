package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f9221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f9223e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b extends q8 {
        public b(String str, Map map, q8 q8Var) {
            super(str, map, q8Var);
        }

        public void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f9114e.add(q8Var);
        }

        public void d(String str) {
            this.f9113d = str;
        }
    }

    public r8(com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f9219a = lVar.Q();
    }

    public static q8 a(String str, com.applovin.impl.sdk.l lVar) {
        return new r8(lVar).a(str);
    }

    public q8 a(String str) throws SAXException {
        if (str != null) {
            this.f9221c = new StringBuilder();
            this.f9220b = new Stack();
            this.f9223e = null;
            Xml.parse(str, new a());
            b bVar = this.f9223e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(strTrim)) {
                r8.this.f9221c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - r8.this.f9222d;
            com.applovin.impl.sdk.p unused = r8.this.f9219a;
            if (com.applovin.impl.sdk.p.a()) {
                r8.this.f9219a.a("XmlParser", defpackage.e.j(seconds, "Finished parsing in ", " seconds"));
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            r8 r8Var = r8.this;
            r8Var.f9223e = (b) r8Var.f9220b.pop();
            r8.this.f9223e.d(r8.this.f9221c.toString().trim());
            r8.this.f9221c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.p unused = r8.this.f9219a;
            if (com.applovin.impl.sdk.p.a()) {
                r8.this.f9219a.a("XmlParser", "Begin parsing...");
            }
            r8.this.f9222d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !r8.this.f9220b.isEmpty() ? (b) r8.this.f9220b.peek() : null;
                b bVar2 = new b(str2, r8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                r8.this.f9220b.push(bVar2);
            } catch (Exception e10) {
                com.applovin.impl.sdk.p unused = r8.this.f9219a;
                if (com.applovin.impl.sdk.p.a()) {
                    r8.this.f9219a.a("XmlParser", defpackage.e.o("Unable to process element <", str2, ">"), e10);
                }
                throw new SAXException("Failed to start element", e10);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }
    }
}
