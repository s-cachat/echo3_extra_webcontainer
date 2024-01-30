module echo3.extras.webcontainer{
    requires echo3.app;
    requires echo3.webcontainer;
    requires jakarta.servlet;
    requires java.xml;
    requires java.desktop;
    requires echo3.extras.app;
    requires jfreechart;
    exports nextapp.echo.extras.webcontainer;
    exports nextapp.echo.extras.webcontainer.service;
    exports nextapp.echo.extras.webcontainer.sync.component;
}

