package br.com.creditas.credit_analysis.repositories

import br.com.creditas.credit_analysis.models.SampleEntity
import java.util.UUID
import org.springframework.data.repository.CrudRepository

interface SampleRepository : CrudRepository<SampleEntity, UUID>
