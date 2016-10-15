<g:if test="${jogadores.size() > 0}">
	<table>
	<tr>
		<th>Jogador</th>
		<th>Vítima</th>
		<th>Facadas</th>
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
