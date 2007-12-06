package org.jboss.cx.remoting.jrpp.msg;

import java.io.Serializable;
import org.jboss.cx.remoting.spi.protocol.ContextIdentifier;
import org.jboss.cx.remoting.spi.protocol.RequestIdentifier;
import org.jboss.cx.remoting.Header;

/**
 *
 */
public final class JrppReply extends JrppRequestBodyMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    public JrppReply(final ContextIdentifier contextIdentifier, final RequestIdentifier requestIdentifier, final Object body, final Header[] headers) {
        super(contextIdentifier, requestIdentifier, body, headers);
    }

    public void accept(JrppMessageVisitor visitor) {
        visitor.visit(this);
    }
}