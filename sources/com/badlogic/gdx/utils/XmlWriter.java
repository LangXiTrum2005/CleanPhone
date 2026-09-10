package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter extends Writer {
    private String currentElement;
    public int indent;
    private boolean indentNextClose;
    private final Array<String> stack = new Array<>();
    private final Writer writer;

    public XmlWriter(Writer writer) {
        this.writer = writer;
    }

    private void indent() throws IOException {
        int i = this.indent;
        if (this.currentElement != null) {
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.writer.write(9);
        }
    }

    private boolean startElementContent() throws IOException {
        String str = this.currentElement;
        if (str == null) {
            return false;
        }
        this.indent++;
        this.stack.add(str);
        this.currentElement = null;
        this.writer.write(">");
        return true;
    }

    public XmlWriter attribute(String str, Object obj) throws IOException {
        if (this.currentElement == null) {
            throw new IllegalStateException();
        }
        this.writer.write(32);
        this.writer.write(str);
        this.writer.write("=\"");
        this.writer.write(obj == null ? "null" : obj.toString());
        this.writer.write(34);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.stack.size != 0) {
            pop();
        }
        this.writer.close();
    }

    public XmlWriter element(String str) throws IOException {
        if (startElementContent()) {
            this.writer.write(10);
        }
        indent();
        this.writer.write(60);
        this.writer.write(str);
        this.currentElement = str;
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    public XmlWriter pop() throws IOException {
        if (this.currentElement != null) {
            this.writer.write("/>\n");
            this.currentElement = null;
        } else {
            this.indent = Math.max(this.indent - 1, 0);
            if (this.indentNextClose) {
                indent();
            }
            this.writer.write("</");
            this.writer.write(this.stack.pop());
            this.writer.write(">\n");
        }
        this.indentNextClose = true;
        return this;
    }

    public XmlWriter text(Object obj) throws IOException {
        startElementContent();
        String string = obj == null ? "null" : obj.toString();
        boolean z = string.length() > 64;
        this.indentNextClose = z;
        if (z) {
            this.writer.write(10);
            indent();
        }
        this.writer.write(string);
        if (this.indentNextClose) {
            this.writer.write(10);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        startElementContent();
        this.writer.write(cArr, i, i2);
    }

    public XmlWriter element(String str, Object obj) throws IOException {
        return element(str).text(obj).pop();
    }
}
