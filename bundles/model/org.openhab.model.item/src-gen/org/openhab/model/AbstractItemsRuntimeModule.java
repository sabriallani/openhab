/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2011, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */

/*
 * generated by Xtext
 */
package org.openhab.model;

import java.util.Properties;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {org.openhab.model.ItemsRuntimeModule}
 */
 @SuppressWarnings("all")
public abstract class AbstractItemsRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "org/openhab/model/Items.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("org.openhab.model.Items");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("items");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return org.openhab.model.services.ItemsGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return org.openhab.model.parseTreeConstruction.ItemsParsetreeConstructor.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return org.openhab.model.parser.antlr.ItemsParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return org.openhab.model.parser.antlr.ItemsAntlrTokenFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return org.openhab.model.parser.antlr.internal.InternalItemsLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<org.openhab.model.parser.antlr.internal.InternalItemsLexer> provideInternalItemsLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(org.openhab.model.parser.antlr.internal.InternalItemsLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(org.openhab.model.parser.antlr.internal.InternalItemsLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.openhab.model.validation.ItemsJavaValidator> bindItemsJavaValidator() {
		return org.openhab.model.validation.ItemsJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.openhab.model.scoping.ItemsScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate")).to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return org.openhab.model.formatting.ItemsFormatter.class;
	}

}
