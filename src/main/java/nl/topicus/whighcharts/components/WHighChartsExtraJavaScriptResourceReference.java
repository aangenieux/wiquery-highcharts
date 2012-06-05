package nl.topicus.whighcharts.components;

import org.apache.wicket.resource.MinifiedAwareJavaScriptResourceReference;

public class WHighChartsExtraJavaScriptResourceReference extends
		MinifiedAwareJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsExtraJavaScriptResourceReference INSTANCE =
		new WHighChartsExtraJavaScriptResourceReference();

	private WHighChartsExtraJavaScriptResourceReference()
	{
		super(WHighChartsExtraJavaScriptResourceReference.class, "jquery.whighcharts.js");
	}

	public static WHighChartsExtraJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
