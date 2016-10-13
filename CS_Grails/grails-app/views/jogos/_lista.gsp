<g:if test="${jogadores.size() > 0}">
	<table>
	<tr>
		<th>Nome</th>
		<th>Preço</th>
		<th>Qtde. Atual</th>
	</tr>
	<g:each var="jogo" in="${jogadores}">
		<tr>
			<td>${jogo.jogador}</td>
			<td>${jogo.vitima}</td>
			<td>${jogo.data}</td>
		</tr>
	</g:each>
	</table>
</g:if>
<g:else>
	Não há produtos.
</g:else>
